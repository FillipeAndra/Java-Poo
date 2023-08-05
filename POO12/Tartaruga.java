package POO12;

public class Tartaruga extends Reptil{

    public Tartaruga(float pe, int id, int me, String co) {
        super(pe, id, me, co);
        
    }
    
    @Override
    public void locomover(){
        System.out.println("A tartaruga agora está caminhando");
    }
}
