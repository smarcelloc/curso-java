package poo.relacionamento.heranca.exercicios;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Kaio");
        aluno.setSexo('m');
        aluno.setIdade(30);
        aluno.setCurso("Curso PHP");
        aluno.setMatricula("120032PHP");
        
        aluno.fazerAniversario();
        aluno.cancelarMatricula();
        
        Professor professor = new Professor();
        professor.setNome("Carmo");
        professor.setSexo('f');
        professor.setIdade(42);
        professor.setEspecialidade("TI");
        professor.setSalario(3400.00);
        
        professor.aumentoSalario(300.00);
        professor.fazerAniversario();
    }
}
