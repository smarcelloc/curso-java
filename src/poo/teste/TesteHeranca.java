package poo.teste;

import poo.visibilidade.Caneta;

public class TesteHeranca extends Caneta {

  public void run() {
    // this.modelo = "BIC" // private ERRO
    // this.cor = "BIC" // private ERRO
    this.carga = 12; // protected ERRO
    this.ponta = 21f; // protected ERRO
    this.tampada = true; // public
    this.rabiscar("OK"); // public
    this.desenhar(); // protected ERRO
    // this.pintar(); // private ERRO
  }
}
