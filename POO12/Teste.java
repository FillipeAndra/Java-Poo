package POO12;

public class Teste {
    public static void main(String[] args){
        Mamifero m = new Mamifero(85.3f,2,4,"preto");
        Reptil r = new Reptil(15, 3, 4, "verde");
        Peixe p  = new Peixe(.35f, 1, 0, "cinza");
        Ave a = new Ave(.89f,2,2,"amarelo");
        Canguru c = new Canguru(40, 3, 5, "marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();

        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        r.locomover();

        c.locomover();

    }
}