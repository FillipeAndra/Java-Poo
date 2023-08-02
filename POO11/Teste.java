package POO11;

public class Teste {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Arnaldo",19, "Masculino", 11111, "Analise de sistemas");
        Bolsista b1 = new Bolsista("Fabiane",19, "Feminino", 11111, "Ciencia da computação", 75f);

        System.out.println(a1.getCurso());
        a1.fazerAniversario();
        a1.pagarMensal();
        System.out.println(a1.getIdade());
        
        b1.renovarBolsa();
        b1.pagarMensal();
    }
}
