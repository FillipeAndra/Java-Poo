package POO14_15;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String t){
        this.titulo = t;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int isAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    
    @Override
    public void play(){
        if(this.reproduzindo == false){
        this.reproduzindo = true;
        this.views ++;
        System.out.println("O vídeo está sendo reproduzido");
        }else{
        System.out.println("Você já está vendo um vídeo");
        }
        
    }

    @Override
    public void pause(){
        if(this.reproduzindo == true){
        this.reproduzindo = false;
        System.out.println("O vídeo está pausado");
        }else{
        System.out.println("você não está reproduzindo um vídeo para poder pausa-lo");
        }
    }
    @Override
    public void like(){
        if (this.reproduzindo == true){
        this.curtidas++;
        System.out.println("Você curtiu o vídeo");
        }else{
        System.out.println("Para dar like em um vídeo você tem que ester reproduzindo algum vídeo");
        }
    }
}
