package POO10;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String se){
        this.nome = no;
        this.idade = id;
        this.sexo = se;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniv(){
        this.idade = this.idade+1;
    }

    @Override
    public String toString() {
        return "Pessoa{"+" nome="+nome+", idade="+idade+" e sexo="+sexo+"}";
    }
}
