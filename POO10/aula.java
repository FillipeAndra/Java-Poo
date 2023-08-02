package POO10;

public class aula {
    public static void main(String[] args){
        //aula de hereditariedade

            // classes filhas herdam caracteristicas
            // e comportamentos das classes mães

            // a herança é aplicada tanto para caracteristicas,
            // quanto para comportamentos

            // para adicinar a ligação entre uma classe filha e sua mãe
            // coloca-se que classe filha extends classe mãe

            // a classe mãe também pode ser conhecida como 
                //classe progenitora
                //superclasse

            // a classe filha também pode ser conhecida como 
                //subclasse

            // as subclasses herdam das superclasse as caracteristicas e os métodos
            // sem precisar reescrever nenhum atributo ou método

            // a catalogação entre subclasse e superclasse depende do ponto de vidta
            // e da relação que uma classe tem com as outras em níveis acima ou abaixo na 
            // hierarquia


            // a super classe que não tem uma classe acima é uma classe raiz

            // as subclasses que não tem filhas (as mais abaixo na árvore) são
            // as folhas

            // há o conceito de ancestrais e descedentes (mesma coisa que uma
            // árvore genealógica)

            // para ser ancestral tem que ser de avó em diante

            // da raiz para as folhas ocorre uma especialização

            // das folhas para a raíz ocorre uma generalização

            // os conceitos de abstrato e final são aplicados aos métodos e às classes

            // as classe abstratas não podem gerar objetos (só serve como progenitora)

            // os métodos abstratos são declarados mas não implementados pelas classes progenitoras

            // a classe final é uma folha

            // os metodos finais não podem ser sobre-escritos




        Pessoa p1 = new Pessoa("Andressa", 25, "Feminino");
        Aluno p2 = new Aluno("André", 19, "Masculino",true,"Ciencia da computação");
        Professor p3 = new Professor("Paulo", 45, "Masculino", "Física", 5500);
        Funcionario p4 = new Funcionario("Alberto",36,"Masculino", "RH", true);

        System.out.println(p1.toString());

        p2.setCurso("Engenharia mecatrônica");
        System.out.println(p2.toString());
        p3.setSalario(6000f);
        System.out.println(p3.toString());
        p4.setSetor("Marcketing");
        System.out.println(p4.toString());

        p3.receberAumento(500.50f);
    }
}
