package POO9;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String ti,String au, int tot, Pessoa lei){
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = tot;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = lei;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String ti){
        this.titulo = ti;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String au){
        this.autor = au;
    }

    public int getTotPaginas(){
        return this.totPaginas;
    }

    public void setTotPaginas(int to){
        this.totPaginas = to;
    }
    
    public int getPagAtual(){
        if(this.aberto == true){
            return this.pagAtual;
        }else{
            System.out.println("Pra ver a página atual você tem que primeiro abrir o livro");
        }
        return this.pagAtual;
    }

    public void setPagAtual(int pa){
        if(this.aberto == true){
            if(0 < pa &&(getTotPaginas()>=pa)){
                this.pagAtual = pa;
            }else{
                System.out.println("Esta página não existe no livro "+this.getTitulo());
            }
        }else{
            System.out.println("Para definir a pagina atual primeiro você tem que abir o livro");
        }
        
    }

    public boolean getAberto(){
        if(this.aberto == true){
            return this.aberto;
        }else{
            System.out.println("O livro está fechado");
        }
        
        return this.aberto;
    }

    public void setAberto(boolean ab){
        this.aberto = ab;
    }

    public Pessoa getLeitor(){
        return this.leitor;
    }

    public void setLeitor(Pessoa le){
        if(this.leitor.getIdade()>= 3){
            this.leitor = le;
            System.out.println("O leitor desse livro é "+this.leitor);
        }else{
            this.leitor = le;
            System.out.println("Tem certeza que você consegue ler?, você mesmo assim será a pessoa com o livro na mão.");
        }
        this.leitor = le;
    }

    public void detalhes(){
        System.out.println("O titulo do livro é "+this.getTitulo());
        System.out.println("O autor do livro é"+this.getAutor());
        System.out.println("O total de paginas é "+this.getTotPaginas());
        if(getAberto() == true){
            System.out.println("A página atual é "+this.getPagAtual());
        }else{
             System.out.println("para ver a página atual você tem que primeiro abrir o livro");
        }
            System.out.println("A página atual é "+this.getPagAtual());
        if(this.aberto == true){
            System.out.println("O livro está aberto");
        }else{
            System.out.println("O livro está fechado");
        }
        System.out.println("O leitor atual é "+this.getLeitor());
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int pa) {
        if(getAberto() == true){
            if(pa <= getTotPaginas()){
                setPagAtual(pa);
                System.out.println(this.getLeitor().getNome()+ " ,você folheia as paginas até página "+getPagAtual());
            }else{
                System.out.println(this.getLeitor().getNome()+ " ,você não tem como folhear mais do que o total de páginas do livro");
            }
        }else{
            System.out.println(this.getLeitor().getNome()+ " ,você não tem como folhear com o livro fechado");
        }    
    }

    @Override
    public void avançarPag() {
        if(getAberto() == true){
            if((getPagAtual()+1)>getTotPaginas()){
                System.out.println(this.getLeitor().getNome()+ " ,você não pode avançar mais uma página, pois já está na última");
            }
            else{
                this.pagAtual = getPagAtual()+1;
                System.out.println(this.getLeitor().getNome()+ " ,você avançou mais uma página, e agora se encontra na "+this.getPagAtual());
            }
        }else{

        }
    }

    @Override
    public void voltarPag() {
         if(getAberto() == true){
            if((getPagAtual()-1)<=0){
                System.out.println(this.getLeitor().getNome()+ " ,você não tem como voltar uma página, pois você já está na primeira.");
            }else{
                this.pagAtual = getPagAtual()-1;
                System.out.println(this.getLeitor().getNome()+ " ,você voltou uma página, e atual é"+getPagAtual());
            }
        }else{
           System.out.println("Não tem como voltar uma pagina com o livro fechado"); 
        }
    }


}
