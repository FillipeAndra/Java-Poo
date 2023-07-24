package POO7_8;
import java.util.Random;

public class Luta {
    Random random = new Random(); 
    int num = random.nextInt(10)+1;
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public Luta(Lutador l1,Lutador l2){
        this.desafiado  = l1;
        this.desafiante = l2;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador d){
        this.desafiado = d;
    }
    
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    
    public void setDesafiante(Lutador d){
        this.desafiante = d;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setRounds(int r){
        this.rounds = r;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

    public void setAprovada(boolean a){
        this.aprovada = a;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        System.out.println("-------Status da luta-------");
        if(l1.getCategoria() == l2.getCategoria()&&(l1.getNome().equals(l2.getNome()) == false)){
            this.aprovada = true;
            setDesafiado(l1);
            setDesafiante(l2);
            System.out.println("A luta foi aprovada e está marcada.");
        }else{
            this.aprovada = false;
            System.out.println("A luta não foi marcada, pois não foi aprovada.");
            l1 = null;
            l2 = null;
        }
        System.out.println("----------------------------");
    }

    public void lutar(Lutador l1, Lutador l2){
        if(getAprovada() == true){
            desafiado.apresentar();
            desafiante.apresentar();
            System.out.println("-------Resultado da luta-------");
            setRounds(this.num);
            if (l1.media() == l2.media()){
                if(getRounds()==1){
                    System.out.println("Houve um empate com "+getRounds()+" round");
                }else{
                    System.out.println("Houve um empate com "+getRounds()+" rounds");
                }
                l1.empatarLuta();
                l2.empatarLuta();
            }else if(l1.media()>l2.media()){
                if(getRounds()==1){
                    System.out.println("O desafiado "+l1.getNome()+ " venceu em "+getRounds()+" round!");
                }else{
                    System.out.println("O desafiado "+l1.getNome()+ " venceu em "+getRounds()+" rounds!");
                }
                l1.ganharLuta();
                l2.perderLuta();
            }else{
                if(getRounds()==1){
                    System.out.println("O desafiante "+l2.getNome()+" venceu a luta em "+getRounds()+" round");
                }else{
                    System.out.println("O desafiante "+l2.getNome()+" venceu a luta em "+getRounds()+" rounds");
                }
                l1.perderLuta();
                l2.ganharLuta();
            }
            System.out.println("-------------------------------");

        }else{
            System.out.println("A luta não pode acontecer.");
        }
    }
}
