package POO14_15;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String n, int i, String s,String l){
      super(n,i,s);
      this.login = l;
      this.totAssistido = 0;
    }

    public String getLogin(){
      return this.login;
    }

    public void setLogin(String l){
      this.login = l;
    }

    public int getTotAssistido(){
      return this.totAssistido;
    }

    public void setTotAssistido(int t){
      this.totAssistido = t;
    }

    public void totAssistido(){
      this.totAssistido++;
      System.out.println(this.nome+" assistiu mais um.");
    }
}
