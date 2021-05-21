package poo.relacionamento.heranca;
// SUBCLASSE, ESPECIALIZAÇÃO, CLASSE-FILHA
public class Aluno extends Pessoa {
    private String ra;
    private Float[] nota = new Float[4];

    public Aluno(String nome, String cpf, Character sexo, String ra) {
        super(nome, cpf, sexo);
        this.ra = ra;
    }
    
    protected void andar(){
        System.out.println("Você está andando!");
    }
}
