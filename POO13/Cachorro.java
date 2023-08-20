package POO13;

public class Cachorro extends Lobo {

    public Cachorro(float p, int m, int i, String c) {
        super(p, m, i, c);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O cachorro está latindo");
    }

    public void reagir(String frase){
        if (frase.equals("hora de comer")||(frase.equals("vamos passear?"))){
            System.out.println("O cachorro está latindo e abanando o rabo");
        }else{
            System.out.println("O cachorro está rosnando");
        }
    }

    public void reagir(int hora){
        if (hora <12){
            System.out.println("O chachorro está abanando o rabo");
        } else if(hora >=18){
            System.out.println("O cachorro ignorando tudo o que você faz");
        }else{
            System.out.println("O cachorro está abanando o rabo e latindo");
        }
    }

    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("O cachorro está abanando o rabo");
        }else{
            System.out.println("O cachorro está rosnando e latindo");
        }
    }

    public void reagir(){
        if(this.idade<=5){
            if(this.peso<10){
                System.out.println("O cachorro está abanando o rabo");      
            }else{
                System.out.println("O cachorro está latindo");
            }
        }else{
            if(this.peso<10){
                System.out.println("O cachorro está rosnando");
            }else{
                System.out.println("O cachorro está ignorando tudo o que você faz");
            }
        }
    }
}
