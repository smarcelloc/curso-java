package poo;

public class Objetos {
  String modelo;
  String cor;
  Float ponta;
  Short carga;
  Boolean tampada;

  void rabiscar(String escrevendo) {
    if (this.tampada) {
      System.out.println("Escrevendo: " + escrevendo);
    } else {
      System.out.println("Ops! A caneta está tampada.");
    }
  }

  void status() {
    System.out.println("Objetos [carga=" + carga + ", cor=" + cor + ", modelo=" + modelo + ", ponta=" + ponta
        + ", tampada=" + tampada + "]");
  }
}