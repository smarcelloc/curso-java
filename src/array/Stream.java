package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

  public static void main(String[] args) {
    List<Pessoa> pessoas = Arrays.asList(new Pessoa("Marcello", 20), new Pessoa("Vanessa", 30),
        new Pessoa("Ricardo", 60));

    List<Pessoa> resultado = pessoas.stream().limit(2).filter(p -> {
      if (p.getIdade() > 20) {
        return true;
      }

      return false;
    }).map(p -> {
      Pessoa obj = new Pessoa(p.getNome(), p.getIdade());
      return obj;
    }).collect(Collectors.toList());

    System.out.println(resultado.toString());
  }

}

/**
 * Pessoa
 */
class Pessoa {

  private String nome;
  private Integer idade;

  Pessoa(String nome, Integer idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  @Override
  public String toString() {
    return "nome: " + this.nome + "\nidade: " + this.idade;
  }

}
