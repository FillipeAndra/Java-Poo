package POO11;

public class Tecnico extends Aluno {
    private int registrProfissi;
    private boolean pratica;
    public Tecnico(String no, int id, String se, int ma, String cur, int rp) {
        super(no, id, se, ma, cur);
        this.registrProfissi = rp;
        this.pratica = false;
    }

    public int getRegistrProfissi() {
        return this.registrProfissi;
    }

    public void setRegistrProfissi(int registrProfissi) {
        this.registrProfissi = registrProfissi;
    }

    public boolean getPratica(){
        return this.pratica;
    }
    
    public void setPratica(boolean pra){
        this.pratica = pra;
    }

    public void praticar(){
        if(this.pratica = false){
            this.pratica = true;
            System.out.println("O aluno técnico "+getNome()+" agora está praticando");
        }else{
            System.out.println("O aluno técnico "+getNome()+" já estava praticando");
        }
    }


    
}
