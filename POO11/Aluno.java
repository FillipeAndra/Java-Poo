package POO11;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public Aluno(String no, int id, String se, int ma, String cur) {
        super(no, id, se);
        this.matricula = ma;
        this.curso = cur;
    }
     
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensal(){
        System.out.println("A mensalidade de "+getNome()+" foi paga.");
    }
}
