package POO12;

public class Reptil extends Animal{
    private String corEscama;
    public Reptil(float pe, int id, int me, String co) {
        super(pe, id, me);
        this.corEscama = co;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
