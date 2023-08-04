package POO12;

public class Peixe extends Animal {
    private String corEscamas;
    public Peixe(float pe, int id, int me, String co) {
        super(pe, id, me);
        this.corEscamas = co;
        
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscamas() {
        return corEscamas;
    }
    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    
}
