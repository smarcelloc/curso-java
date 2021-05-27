package poo.polimorfismo.universal.inclusao;

// POLIMORFISMO - INCLUSÃO

// DECLARAR TIPO COM CLASSE-MÃE EM VEZ DA FILHA
// E INSTANCIAR COM A CLASSE-FILHA

// POR EXEMPLO
// NORMAL: Cachorro c = new Cachorro();
// INCLUSÃO: Animal c = new Cachorro();

public class Main {
    public static void main(String[] args) {
        // NORMAL SERIA ASSIM:
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        
        c.nome = "Tonny";
        c.idade = 12;
        c.velocidade = 2d; // 2d = double
        
        g.nome = "Tom";
        g.idade = 5;
        g.branco = true;
        
        // POLIMORFISMO DE INCLUSÃO
        Animal ga = new Cachorro();
        Animal ca = new Gato();
        
        ca.nome = "Tonny";
        ca.idade = 12;
        //ca.velocidade = 2d; ERRO: NÃO HERDA O ATRIBUTO e NEM MÉTODO
        
        ga.nome = "Tom";
        ga.idade = 5;
        //ga.branco = true; ERRO: NÃO HERDA O ATRIBUTO e NEM MÉTODO
    }
}
