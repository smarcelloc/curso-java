package poo.relacionamentodeclasse.heranca.supers;

public class Aluno extends Pessoa {
  private String ra;
  private String[] notas = new String[3];

  public Aluno(String nomeDaPessoa, String ra) {
    super(nomeDaPessoa);
    this.ra = ra;
  }
}
