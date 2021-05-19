package arrays.dinamico;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Pessoa {

    public String nome;
    public Integer idade;

    Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "[nome: " + this.nome + "; idade: " + this.idade + "]";
    }
}

public class Stream {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Marcello", 20),
                new Pessoa("Vanessa", 30),
                new Pessoa("Ricardo", 60),
                new Pessoa("Bernardo", 12)
        );
        
        System.out.println("PRIMEIRA LISTA");
        imprimirArray(pessoas);

        // CRIAR UM NOVO ARRAY
        List<Pessoa> resultado = pessoas.stream().filter(p -> {
            return (p.idade > 20); // TRUE ou FALSE
        }).map(p -> {
            Pessoa obj = new Pessoa(p.nome, p.idade);
            return obj;
        }).collect(Collectors.toList());
        
        System.out.println("\nCRIAR UM NOVO ARRAY - MAIOR QUE 20 ANOS");
        imprimirArray(resultado);
        
        
    }
    
    private static void imprimirArray(List<Pessoa> pessoas){
        pessoas.forEach(el -> {
            System.out.println(el.toString());
        });
    }
}
