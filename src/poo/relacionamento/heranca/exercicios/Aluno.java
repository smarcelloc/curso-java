package poo.relacionamento.heranca.exercicios;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    // Construtor
    public Aluno(){}
    
    public Aluno(String nome, Integer idade, Character sexo){
        super(nome, idade, sexo);
    }
    
    public Aluno(String matricula, String curso, String nome, Integer idade, Character sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula(){
        System.out.println("Cancelado a sua matricula");
        this.matricula = null;
    }
}
