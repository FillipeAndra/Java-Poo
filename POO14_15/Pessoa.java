package POO14_15;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public Pessoa(String n, int i, String s){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
        this.experiencia = 0;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
    public int getExperiencia(){
        return this.experiencia;
    }
    public void setExperiencia(int e){
        this.experiencia = e;
    }

    protected void ganharExp(){
        this.experiencia ++;
        System.out.println(this.nome+" ganhou mais experiência");
    }  
}
