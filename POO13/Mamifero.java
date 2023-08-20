package POO13;

public class Mamifero extends Animal {
    protected String corDoPelo;
    
    public Mamifero(float p, int m, int i, String c) {
        super(p, m, i);
        this.corDoPelo = c;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void alimentar() {
        System.out.println("O mamífero está mamando");
    }

    @Override
    public void locomover() {
        System.out.println("O mamífero está correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("*Soms de mamífero*");
    }


}
