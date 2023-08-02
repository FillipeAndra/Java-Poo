package POO11;

public class Bolsista extends Aluno {
    private float bolsa;
    private boolean estado;
    public Bolsista(String no, int id, String se, int ma, String cur, float bo) {
        super(no, id, se, ma, cur);
        this.bolsa = bo;
        this.estado = false;
        //TODO Auto-generated constructor stub
    }
    
    public float getBolsa() {
        return bolsa;
    }
     
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void setEstado(boolean es){
        this.estado = es;
    }

    public void renovarBolsa(){
        if(this.estado == false){
            this.estado = true;
            System.out.println("A bolsa de "+this.bolsa+"% de "+getNome()+" foi renovada");
        }else{
            System.out.println("Sua bolsa já está ativa");
        }
    }

    @Override
    public void pagarMensal(){
        System.out.println("A mensalidade de "+getNome()+" com desconto de "+this.bolsa+"% foi paga.");
    }

}
