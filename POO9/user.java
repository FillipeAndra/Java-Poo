package POO9;

public class user {
    public static void main(String[] args){
        Pessoa joao = new Pessoa("joão",19,"masculino");
        Pessoa maria = new Pessoa("Maria", 25, "Feminino");

        Livro dracula = new Livro("Dracula","Bram Stocker", 500, joao);
        Livro hobbit = new Livro("Hobbit", "J. R. R. Tolkien", 600, maria);

        dracula.abrir();
        dracula.folhear(260);
        hobbit.abrir();
        hobbit.folhear(600);
    }
}
