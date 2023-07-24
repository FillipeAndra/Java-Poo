package POO7_8;

public class aula {
    public static void main(String[] args) {
        // relacionamento entre classes

            //entre os diferentes tipos, há o de agregação (como se fosse "esse" tem um "daquele")

                // no caso aqui presente houve a utilização (agregação) de uma classe, no caso a lutador,
                // para dentro do classe luta, instanciando doia atributos da ultima, quase (praticamente) 
                // que os tornando objetos da primeira classe.
        
        Lutador la[] = new Lutador[5];
        la[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        
        la[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        la[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        la[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        
        la[4] = new Lutador("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 14);
        
        la[0].apresentar();
        la[2].ganharLuta();
        la[2].status();
        
        Luta UEC01 = new Luta(la[2],la[3]);
        UEC01.marcarLuta(la[2],la[3]);
        UEC01.lutar(la[2], la[3]);
        la[0].status();
        la[1].status();
    }
}
