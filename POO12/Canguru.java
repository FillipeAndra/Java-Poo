package POO12;

public class Canguru extends Mamifero {

    public Canguru(float pe, int id, int me, String co) {
        super(pe, id, me, co);
        
    }

    @Override
    public void locomover(){
        System.out.println("Canguru está pulando");
    }
    public void usarBolsa(){
        System.out.println("O canguru guardou algo em sua bolsa");
    } 
    
}
