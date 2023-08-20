package POO13;

public abstract class Animal {
    protected float peso;
    protected int membros;
    protected int idade;

    public Animal(float p, int m, int i){
        this.peso = p;
        this.membros = m;
        this.idade = i;
    }

    public abstract void alimentar();
    public abstract void locomover();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

}
