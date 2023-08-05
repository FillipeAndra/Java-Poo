package POO12;

public class Cachorro extends Mamifero{

    public Cachorro(float pe, int id, int me, String co) {
        super(pe, id, me, co);
    
    }

    public void enterrarOsso(){
        System.out.println("O cachorro enterroum um osso");
    }

    public void abanarRabo(){
        System.out.println("O cachorro agora está abanando o rabo");
    }

    
    
}
