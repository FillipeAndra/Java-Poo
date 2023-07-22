package POO6;

public class aula{
    public static void main(String[] args){
        //aula de encapsulamento
        
        //alguns dos pilares de poo:

        // >EHP
        // E: encapsulamento: cria um capsula: uma proteção entre o usuario e a classe (atributos e metodos); 
            
            //também serve apara padronizar, usando assim moldes padrão 
                
            // para ocorrer uma conversa entre o corpo da classe e o usuario tem que ser por meio de mensagens 
            
            //(como por exemplo há o uso de métodos publicos para conversar com os atributos e os métodos internos)
            
            // interface é aquilo que interage com o usuario ou outro programador, além de proteger o código da classe (o que define o que pode ser feito pelo objeto da classe)

            // vantagens de se encapsular:
            
                // torna mudanças invisíveis

                // facilita a reutilização de código, dá pra usar a mesma classe em mais de um projeto

                // reduz os "efeitos colaterais" - efeitos danosos a classe passiveis de serem feitos por outro programador

            // como encapsular: criando uma interface para seu usuario usar, sem que ele tenha conhecimento ou acesso ao que esta sendo realizado no interior da classe
                    
                // A interface que ficará visivel ao usuario só apresentará métodos
                
                // esses métodos abstratos que ficam na interface só ficará um guia do que vc pode fazer com cada método, o código de verdade ficará dentro da classe 

                // todos os metodos abstratos presentes na interface são públicos

                // os métodos abstratos apresentados na interface só serão implementeados dentro da classe como publicos

                // ainda deve haver dentro da classe os metodos setters, os getters e os construtores, podendo esses serem públicos ou privados

                // os atributos serão sempre privados ou protegidos

        // H: herança 
        // P: polimorfismo  

        // tem de penetra a abstração: que é vc considerar para criação de atributos e metodos somente
        // as caracteristicas que serão necessárias usar
    }
}