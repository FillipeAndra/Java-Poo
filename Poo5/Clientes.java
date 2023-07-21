package Poo5;

public class Clientes {
    
  public static void main(String[] args) {
    Banco jubileu = new Banco(1, "Jubileu");// ele tem conta pupança
    Banco creusa = new Banco(2, "Creusa"); // ela tem conta corrente
    jubileu.abrirConta();
    jubileu.depositar(300);
    jubileu.mostrar();
    creusa.abrirConta();
    creusa.depositar(500);
    creusa.sacar(100);
    creusa.mostrar();
  }
}
