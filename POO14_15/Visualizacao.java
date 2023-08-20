package POO14_15;

public class Visualizacao{
    public Gafanhoto espectador;
    public Video filme;

    public Visualizacao(Gafanhoto e, Video f){
        this.espectador = e;
        this.filme = f;
        this.filme.setViews(this.filme.getViews()+1);
        this.filme.setReproduzindo(true);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }
    
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int n){
        if(0<=n&&(n<=10)){
            this.filme.setAvaliacao(n);
        }else{
            System.out.println("Por favor digite um número entre 0 e 10");
        }
        
    }

    public void avaliar(float n){
       if(n<=0){
            this.filme.setAvaliacao(0);
       }else if(0<=10){
            this.filme.setAvaliacao(1);
       }else if(0<=20){
            this.filme.setAvaliacao(2);
       }else if(0<=30){
            this.filme.setAvaliacao(3);
       }else if(0<=40){
            this.filme.setAvaliacao(4);
       }else if(0<=50){
            this.filme.setAvaliacao(5);
       }else if(0<=60){
            this.filme.setAvaliacao(6);
       }else if(0<=70){
            this.filme.setAvaliacao(7);
       }else if(0<=80){
            this.filme.setAvaliacao(8);
       }else if(0<=90){
            this.filme.setAvaliacao(2);
       }else{
            this.filme.setAvaliacao(10);
       }
    }
}