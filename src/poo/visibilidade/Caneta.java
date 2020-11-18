package poo.visibilidade;

public class Caneta {
  private String modelo;
  private String cor;
  protected Float ponta;
  protected Short carga;
  public Boolean tampada;

  public void rabiscar(String escrevendo) {
    System.out.println("Escrevendo: " + escrevendo);
  }

  protected void desenhar() {
    System.out.println("Desenhando: ");
  }

  private void pintar() {
    System.out.println("Tintar: ");
  }
}
