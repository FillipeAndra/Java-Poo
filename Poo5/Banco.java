package Poo5;

import java.util.Scanner;

public class Banco {
  Scanner leitor = new Scanner(System.in);
  public float numConta; // número da conta
  protected String tipo; // qual tipo de conta: polpança ou corrente
  private String nomeDono;// nome do dono da conta
  private float saldo; // quanto tem na conta
  private boolean status; // se a conta esta aberta(ativa) ou desativada(fechada)
  private String leitura = "a";
  private String escolha = "a";
  private float num;
  private boolean esco;

  public Banco(float n, String d) {
    this.numConta = n;
    this.nomeDono = d;
    this.saldo = 0;
    this.tipo = "Conta fechada";
    this.status = false;
  }

  public void abrirConta() {
    if (this.status == false) {
      this.status = true;
      System.out.println("Por favor digite cc para conta corrente ou cp para conta poupanca!");
      this.leitura = leitor.nextLine();
      while (true) {
        if (this.leitura.equals("cc") && (this.tipo.equals("Conta corrente") == false)) {
          if (this.tipo.equals("Conta poupanca")) {
            this.saldo = this.saldo + 0;
            this.tipo = "Conta corrente";
            break;
          } else {
            this.saldo = this.saldo + 50;
            this.tipo = "Conta corrente";
            break;
          }
        } else if (this.leitura.equals("cp") && (this.tipo.equals("Conta poupanca") == false)) {
          if (this.tipo.equals("Conta corrente")) {
            this.saldo = this.saldo + 100;
            this.tipo = "Conta poupanca";
            break;
          } else {
            this.saldo = this.saldo + 150;
            this.tipo = "Conta poupanca";
            break;
          }
        } else if ((this.leitura.equals("cp") && (this.tipo.equals("Conta poupanca") == true))) {
          System.out.println("Por favor digite a outra opcao, sua conta ja e conta poupanca");
        } else if (this.leitura.equals("cc") && (this.tipo.equals("Conta corrente") == true)) {
          System.out.println("Por favor digite a outra opcao, sua conta ja e conta corrente");
        }
        System.out.println("Por favor digite cc para conta corrente ou cp para conta poupanca!");
        this.leitura = leitor.nextLine();
      }
    } else {
      System.out.println("Sua conta ja esta aberta");
      System.out.println("...Cancelando operacao...");
    }
  }

  public void fecharConta() {
    if (this.saldo < 0) {
      System.out
          .println("Para fechar a conta voce tem depositar " + (this.saldo * (-1)) + " valor, que e o que voce deve");
      System.out.println("voce quer depositar esse valor?['s' para sim e 'n' para nao]");
      this.escolha = leitor.nextLine();
      while (true) {
        if (escolha.equals("s")) {
          this.saldo = 0;
          System.out.println("Sua divida foi quitada, e sua conta sera fechada.");
          this.status = false;
          break;
        }
        if (escolha.equals("n")) {
          System.out.println("Ate que a divida seja quitada, voce nao pode fechar sua conta.");
          System.out.println("...Cancelando socilitacao");
          this.status = true;
          break;
        } else {
          System.out.println("Por favor digite 's' para sim ou 'n' para nao.");
          this.escolha = leitor.nextLine();
        }
      }

    }
    if (this.saldo == 0) {
      System.out.println("Fechando conta...");
      this.status = false;
    }
    if (this.saldo > 0) {
      System.out
          .println("Para fechar a conta voce tem sacar " + (this.saldo) + " valor, que e o que voce tem de saldo");
      System.out.println("voce quer sacar esse valor?['s' para sim e 'n' para nao]");
      this.escolha = leitor.nextLine();
      while (true) {
        if (escolha.equals("s")) {
          this.saldo = 0;
          System.out.println("Seu saldo foi sacado, e sua conta sera fechada.");
          this.status = false;
          break;
        }
        if (escolha.equals("n")) {
          System.out.println("Ate que o seu saldo estaja como 0, voce nao pode fechar sua conta.");
          System.out.println("...Cancelando socilitacao");
          this.status = true;
          break;
        } else {
          System.out.println("Por favor digite 's' para sim ou 'n' para nao.");
          this.escolha = leitor.nextLine();
        }
      }
    }
  }

  public void depositar(float v) {
    if (this.status == true) {
      this.saldo = this.saldo + v;
    }
    if (this.status == false) {
      System.out.println("Voce so pode depositar de a conta estiver aberta");
      System.out.println("Voce quer abrir a conta?['s' para sim e 'n' para nao]");
      this.escolha = leitor.nextLine();
      while (true) {
        if (escolha.equals("s")) {
          this.status = true;
          abrirConta();
          break;
        }
        if (escolha.equals("n")) {
          System.out.println("Ate que voce abra uma conta, voce nao pode depositar.");
          System.out.println("...Cancelando socilitacao");
          this.status = false;
          break;
        } else {
          System.out.println("Por favor digite 's' para sim ou 'n' para nao.");
          this.escolha = leitor.nextLine();
        }
      }
    }
  }

  public void sacar(float v) {
    if (this.status == true) {
      while (true) {
        if (this.saldo > 0) {
          if (v >= this.saldo) {
            System.out.println("Voce so tem " + this.saldo + " entao, sera esse valor que voce vai poder sacar");
            this.saldo = 0;
            break;
          } else {
            this.saldo = this.saldo - v;
            break;
          }
        } else {
          System.out.println("Para sacar algo voce tem que estar com saldo positivo maior que zero");
          System.out.println("Voce quer fazer isso?['s' para sim e 'n' para nao]");
          this.escolha = leitor.nextLine();
          while (true) {
            if (escolha.equals("s")) {
              System.out.println("qual valor vc quer depositar?");
              this.num = leitor.nextFloat();
              depositar(this.num);
              break;
            }
            if (escolha.equals("n")) {
              System.out
                  .println("Ate que voce deposite uma valor para deixar a conta acima do 0, voce nao pode sacar.");
              System.out.println("...Cancelando socilitacao");
              break;
            } else {
              System.out.println("Por favor digite 's' para sim ou 'n' para nao.");
              this.escolha = leitor.nextLine();
            }
          }
        }
      }
    } else {
      System.out.println("Voce so pode sacar de a conta estiver aberta");
      System.out.println("Voce quer abrir a conta?['s' para sim e 'n' para nao]");
      this.escolha = leitor.nextLine();
      while (true) {
        if (escolha.equals("s")) {
          abrirConta();
          break;
        }
        if (escolha.equals("n")) {
          System.out.println("Ate que voce abra uma conta, voce nao pode sacar.");
          System.out.println("...Cancelando socilitacao");
          this.status = false;
          break;
        } else {
          System.out.println("Por favor digite 's' para sim ou 'n' para nao.");
          this.escolha = leitor.nextLine();
        }
      }
    }
  }

  public void pagarMensalidade() {
    if (this.status == true) {
      if (this.tipo.equals("Conta corrente")) {
        this.saldo = this.saldo - 12;
      }
      if (this.tipo.equals("Conta poupanca")) {
        this.saldo = this.saldo - 20;
      }
    } else {
      System.out.println("Como voce nao tem conta aberta, nao tem como cobrar mensalidade");
      System.out.println("...Cancelando solicitacao...");
    }

  }

  public float getSaldo() {
    System.out.println("O saldo atual e de: " + this.saldo);
    return this.saldo;
  }

  public float setSaldo(float s) {
    this.saldo = s;
    return this.saldo;
  }

  public String getTipo() {
    System.out.println("O tipo de sua conta atualmente e de " + this.tipo);
    return this.tipo;
  }

  public String setTipo(String to) {
    if (this.status == true) {
      while (true) {
        if (to.equals("cc") && (this.tipo.equals("Conta corrente") == false)) {
          if (this.tipo.equals("Conta poupanca")) {
            this.saldo = this.saldo + 0;
            this.tipo = "Conta corrente";
            break;
          } else {
            this.saldo = this.saldo + 50;
            this.tipo = "Conta corrente";
            break;
          }
        } else if (to.equals("cp") && (this.tipo.equals("Conta poupanca") == false)) {
          if (this.tipo.equals("Conta corrente")) {
            this.saldo = this.saldo + 100;
            this.tipo = "Conta poupanca";
            break;
          } else {
            this.saldo = this.saldo + 150;
            this.tipo = "Conta poupanca";
            break;
          }
        } else {
          if (this.leitura.equals("cc") && (this.tipo.equals("Conta corrente") == false)) {
            if (this.tipo.equals("Conta poupanca")) {
              this.saldo = this.saldo + 0;
              this.tipo = "Conta corrente";
              break;
            } else {
              this.saldo = this.saldo + 50;
              this.tipo = "Conta corrente";
              break;
            }
          } else if (this.leitura.equals("cp") && (this.tipo.equals("Conta poupanca") == false)) {
            if (this.tipo.equals("Conta corrente")) {
              this.saldo = this.saldo + 100;
              this.tipo = "Conta poupanca";
              break;
            } else {
              this.saldo = this.saldo + 50;
              this.tipo = "Conta corrente";
              break;
            }
          } else if ((this.leitura.equals("cp") && (this.tipo.equals("Conta poupanca") == true))) {
            System.out.println("Por digite a outra opcao, sua conta ja e conta poupanca");
          } else if (this.leitura.equals("cc") && (this.tipo.equals("Conta corrente") == true)) {
            System.out.println("Por digite a outra opcao, sua conta ja e conta corrente");
          }
          System.out.println("Por favor digite cc para conta corrente ou cp para conta poupanca!");
          this.leitura = leitor.nextLine();
        }
      }
    } else {
      System.out.println(
          "Para dizer qual o tipo de conta, primeiro essa tem que estar aberta, por favor abra uma conta e tente novamente");
      System.out.println("...Cancelando solicitacao...");
    }
    return this.tipo;
  }

  public String getNomeDono() {
    if (this.status == true) {
      System.out.println("O nome do usuario dessa conta e: " + this.nomeDono);

    } else {
      System.out.println("Como a conta nao esta aberta, entao nao ha usuario com essa conta");
    }
    return this.nomeDono;
  }

  public void setNomeDono() {
    if (this.status == true) {

      System.out.println("Digite o nome que deseja cadastrar");
      this.leitura = leitor.nextLine();
      this.nomeDono = this.leitura;
    } else {
      System.out.println("Como a conta esta fechada, não tem como mudar o nome do usuario.");
    }
  }

  public float getnumConta() {
    System.out.println("O numero da sua conta e " + this.numConta);
    return this.numConta;
  }

  public void setnumConta(float n) {
    if (this.numConta == n) {
      System.out.println("Esse ja e o numero da conta.");
    } else {
      this.numConta = n;
      System.out.println("O numero da conta agora e " + this.numConta);
    }
  }

  public boolean getStatus() {
    System.out.println("O estado de sua conta e " + this.status);
    return this.status;
  }

  public void setStatus(boolean s) {
    while (true) {
      if (this.status == s) {
        System.out.println("Esse ja e o estado de sua conta");
      } else {
        this.status = s;
        System.out.println("O estado da sua conta agora e " + this.status);
        break;
      }
      while (true) {
        System.out.println("Por favor digite true para abrir conta ou false para fechar conta!");
        this.esco = leitor.nextBoolean();
        if (this.esco == this.status) {
          System.out.println("Esse ja e o estado de sua conta");
        } else {
          this.status = this.esco;
          System.out.println("O estado da sua conta agora e " + this.status);
          break;
        }
      }
      break;
    }
  }

  public void mostrar() {
    System.out.println("--------------------------------------------");
    System.out.println("Conta de " + this.nomeDono);
    System.out.println("Numero da conta: " + this.numConta);
    System.out.println("Tipo da conta: " + this.tipo);
    System.out.println("Nome do usuario: " + this.nomeDono);
    System.out.println("Saldo atual: " + this.saldo);
    if (this.status == true) {
      System.out.println("A conta esta: aberta");
      System.out.println("--------------------------------------------");
    } else {
      System.out.println("A conta esta: fechada");
      System.out.println("--------------------------------------------");
    }
  }
}