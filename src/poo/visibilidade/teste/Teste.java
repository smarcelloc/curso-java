package poo.visibilidade.teste;

import poo.visibilidade.Caneta;

public class Teste {

  public static void run() {
    Caneta caneta = new Caneta();
    // caneta.modelo = "BIC" // private ERRO
    // caneta.cor = "BIC" // private ERRO
    // caneta.carga = 12; // protected ERRO
    // caneta.ponta = 21f; // protected ERRO
    caneta.tampada = true; // public
    caneta.rabiscar("OK"); // public
    // caneta.desenhar(); // protected ERRO
    // caneta.pintar(); // private ERRO
  }
}
