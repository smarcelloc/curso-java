package poo.relacionamentodeclasse;

import java.util.Random;

public class Lutas implements LutasInterface {
  private Lutador desafiador;
  private Lutador desafiante;
  private Integer rounds;
  private Boolean aprovado;

  public Lutas() {

  }

  public Lutas(Lutador desafiador, Lutador desafiante, Integer rounds, Boolean aprovado) {
    this.desafiador = desafiador;
    this.desafiante = desafiante;
    this.rounds = rounds;
    this.aprovado = aprovado;
  }

  public Lutador getDesafiador() {
    return desafiador;
  }

  public void setDesafiador(Lutador desafiador) {
    this.desafiador = desafiador;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public Integer getRounds() {
    return rounds;
  }

  public void setRounds(Integer rounds) {
    this.rounds = rounds;
  }

  public Boolean getAprovado() {
    return aprovado;
  }

  public void setAprovado(Boolean aprovado) {
    this.aprovado = aprovado;
  }

  @Override
  public String toString() {
    return "Lutas [aprovado=" + aprovado + ", desafiador=" + desafiador.toString() + ", desafiante="
        + desafiante.toString() + ", rounds=" + rounds + "]";
  }

  @Override
  public void marcarLuta() {
    if (this.desafiador.getCategoria() == this.desafiante.getCategoria()) {
      this.aprovado = true;
    } else {
      this.aprovado = false;
    }
  }

  @Override
  public void lutar() {
    if (this.aprovado) {
      Integer resultado = this._resultadoDaLuta();

      switch (resultado) {
        case 1:
          this.desafiador.ganharLuta();
          this.desafiante.perderLuta();
          System.out.println("O " + this.desafiador.getNome() + " VENCEU");
          break;
        case 2:
          this.desafiador.perderLuta();
          this.desafiante.ganharLuta();
          System.out.println("O " + this.desafiante.getNome() + " VENCEU");
          break;
        default:
          this.desafiador.empatarLuta();
          this.desafiante.empatarLuta();
          System.out.println("A LUTA FOI EMPATADA !!!");
          break;
      }

    } else {
      System.out.println("Luta não aprovada!!");
    }
  }

  private Integer _resultadoDaLuta() {
    Integer minimo = 1;
    Random random = new Random();
    return random.nextInt(3) + minimo;
  }
}
