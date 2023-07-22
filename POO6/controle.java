package POO6;

public class controle implements controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public controle(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    private int getVolume(){
        return this.volume;
    }   
    private void setVolume(int v){
        this.volume = v;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
    //abstratos:
    @Override
    public void ligar() {
        if(this.ligado == false){
            setLigado(true);
        }else{
            System.out.println("A tv já está ligada");
        }
    }
    @Override
    public void desligar() {
        if(this.ligado == true){
            setLigado(false);
        }else{
            System.out.println("A tv já está desligada");
        }
    }
    @Override
    public void abrirMenu() {
            System.out.println("---------Menu---------");
            System.out.println("Está ligado: "+getLigado());
            System.out.println("O volume é: "+getVolume());
            for(int i = 0; i < ((getVolume())/10);i++ ){
                System.out.print("|");
            }
            System.out.println("\nEstá tocando:"+getTocando());
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }
    @Override
    public void maisVolume() {
        if(this.ligado == true &&(this.volume<100)){
            setVolume(getVolume()+1);
        }else if(this.ligado == true &&(this.volume==100)) {
            System.out.println("O volume já está no maximo");
        }else{
            System.out.println("A tv está deligada");
        }
    }
    @Override
    public void menosVolume() {
        if(this.ligado == true &&(this.volume>0)){
            setVolume(getVolume()-1);
        }else if(this.ligado == true &&(this.volume == 0)){
            System.out.println("O volume já está no mínimo");
        }else{
            System.out.println("A tv está deligada");
        }
    }
    @Override
    public void ligarMudo() {
        if(this.ligado == true&&(this.volume>0)){
            setVolume(0);
        }else if(this.ligado == false){
            System.out.println("A tv está deligada");
        }
    }
    @Override
    public void desligarMudo() {
        if(this.ligado == true&&(this.volume==0)){
            setVolume(50);
        }else if(this.ligado == false){
            System.out.println("A tv está deligada");
        }
    }
    @Override
    public void play() {
        if(this.ligado== true &&(this.tocando==false)){
            setTocando(true);
        }else if(this.ligado == false){
            System.out.println("A tv está deligada");
        }
    }
    @Override
    public void pause() {
        if(this.ligado == true&&(this.tocando==true)){
            setTocando(false);
        }else if(this.ligado == false){
            System.out.println("A tv está deligada");
        }
    }

}
