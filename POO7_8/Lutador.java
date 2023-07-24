package POO7_8;
import java.util.Random;

public class Lutador implements interfaceLutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float med;
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        // falta colocar o metodo setcategoria adaptado ao peso para depois jogar aqui dentro
        this.nome = no;
        this.nacionalidade = na;
        this.altura = al;
        this.idade = id;
        this.peso = pe;
        setCategoria();
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float a){
        this.altura = a;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float p){
        this.peso = p;
        setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
    private void setCategoria(){
        if(this.peso<52.2){
            this.categoria = "Invalido";
        }else if(this.peso<=70.3){
            this.categoria = "Leve";
        }else if(this.peso<=83.9){
            this.categoria = "Médio";
        }else if(this.peso<=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void  setVitorias(int v){
        this.vitorias = v;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int d){
        this.derrotas = d;
    } 
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int e){
        this.empates = e;
    }
    private float getMed(){
        return this.med;
    }
    private void setMed(float m){
        this.med = m;
    }

    public float media(){
        Random random = new Random();
        int sorte = random.nextInt(150)+1;
        setMed(((getAltura()*200)+(getPeso()*3)+(getVitorias()*15f)+sorte)/3);
        return getMed();
    }

    @Override
    public void apresentar() {
        System.out.println("-------Apresentacao-------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Nacionalidade: "+this.nacionalidade);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso: "+this.peso);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Vitorias: "+this.vitorias);
        System.out.println("Derrotas: "+this.derrotas);
        System.out.println("Empates: "+this.empates);
        System.out.println("--------------------------");
    }

    @Override
    public void status() {
        System.out.println("-------Status-------");
        System.out.print(getNome());
        System.out.print(" é um peso "+getCategoria());
        System.out.print(" com "+this.vitorias+" vitorias, ");
        System.out.print(this.derrotas+" derrotas");
        System.out.print(" e "+this.empates+" empates.\n");
        System.out.println("--------------------");
    }

    @Override
    public void ganharLuta() {
        this.vitorias = getVitorias()+1;
    }

    @Override
    public void perderLuta() {
        this.derrotas = getDerrotas()+1;
    }

    @Override
    public void empatarLuta() {
        this.empates = getEmpates()+1;
    }

}