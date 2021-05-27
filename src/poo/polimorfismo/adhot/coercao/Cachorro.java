package poo.polimorfismo.adhot.coercao;

// POLIFORMISMO - COERÇÃO 
// USO DE CASTING PARA POO
// OU SEJA, FORÇAR O TIPO DO ATRIBUTO

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, float idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = (int) idade; // USO DE CASTING
    }
    
    
}
