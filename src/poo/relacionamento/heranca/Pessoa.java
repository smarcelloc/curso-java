package poo.relacionamento.heranca;
// SUPERCLASSE, GENERALIZAÇÃO, CLASSE-MÃE
public class Pessoa {
    private String nome;
    private String cpf;
    private Character sexo;

    public Pessoa(String nome, String cpf, Character sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }
}
