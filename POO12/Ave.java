package POO12;

public class Ave extends Animal{
    private String corPena;
    public Ave(float pe, int id, int me, String co) {
        super(pe, id, me);
        this.corPena = co;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de ave");
    }

    public void fazerNinho(){
        System.out.println("A ave construiu um ninho");
    }
    
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
