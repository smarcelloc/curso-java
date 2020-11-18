package poo.encapsulamento;

public class Caneta implements CanetaInterface {
  private String modelo;
  private String cor;

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public void rabiscar(String escrevendo) {
    // TODO Auto-generated method stub
  }
}
