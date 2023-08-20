package POO13;

public class Aula {
    public static void teoria(String[] args){
        // polimorfirmos(diferentes formas de realizar a mesma atividade)

        // para isso é necessário os métodos polimorfos terem a mesma assinatura

        // um método ter a mesma assinatura de outro é quando os dois 
        // a mesma quantidade de parâmetros e esses ultimos tbm tendo o mesmo tipo(int, float ...)

        // existem dois tipos de polimorfismos:

            //por sobreposição(em uma classe filha o método escolhido sofre um @Override e assim o que acontece
            // nele quando está método é chamado para a classe filha é diferente de quando é chamado para 
            // a classe mãe) [tem que estar em classes diferentes] [tem a mesma assinatura]


            // por sobrecarga( para isso acontecer tem que ser na mesma classe e tem que assinatura diferente, 
            // além de ser o mesmo método )
    }

    public static void main(String[] args){
        Cachorro c = new Cachorro(29, 4, 4, "Preto");
        c.reagir("hora de comer");
        c.reagir("vai apanhar");
        c.reagir(true);
        c.reagir(11);
        c.reagir(19);
        c.reagir();
        
    }
}
