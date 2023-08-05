package POO12;

public class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(float pe, int id, int me, String co) {
        super(pe, id, me);
        this.corPelo = co;
        
    }

    @Override
    public void locomover() {
        System.out.println("O mamífero está correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("O animal está mamando");
       
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
