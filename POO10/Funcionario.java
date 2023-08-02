package POO10;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario(String no, int id, String se, String setor, boolean trabalhando) {
        super(no, id, se);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){
        if(this.trabalhando == true){
            this.trabalhando = false;
            System.out.println("Agora o(a) funcionario(a) está em descanço");
        }else{
            this.trabalhando = true;
            System.out.println("Agora o(a) funcionario(a) está trabalhando");
        }
    }
}
