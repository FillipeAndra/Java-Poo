package POO10;

public class Aluno extends Pessoa {

    private boolean matricula;
    private String curso;
    

    public Aluno(String no, int id, String se, boolean matricula, String curso) {
        super(no, id, se);
        this.matricula = matricula;
        this.curso = curso;
    }

    public boolean getMatricula() {
        return this.matricula;
    }

    public void setMatricula(boolean matr) {
        this.matricula = matr;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr(){
        this.matricula = false;
    }
}
