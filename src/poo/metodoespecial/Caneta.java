package poo.metodoespecial;

public class Caneta {
  private String modelo;
  private String cor;

  // Construct
  public Caneta(String modelo, String cor) {
    this.modelo = modelo;
    this.cor = cor;
  }

  public Caneta() {}

  // Getters
  public String getModelo() {
    return modelo;
  }

  public String getCor() {
    return cor;
  }

  // Setters
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }
}
