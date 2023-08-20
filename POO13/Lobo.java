package POO13;

public class Lobo extends Mamifero{

    public Lobo(float p, int m, int i, String c) {
        super(p, m, i, c);
        
    }
    

    @Override
    public void emitirSom(){
        System.out.println("O lobo está uivando");
    }
}
