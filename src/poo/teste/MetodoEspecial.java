package poo.teste;

import poo.metodoespecial.Caneta;

public class MetodoEspecial {

  public void run() {
    // Construtor
    Caneta caneta = new Caneta();
    Caneta caneta01 = new Caneta("BIC", "azul");

    // Getters
    System.out.println(caneta01.getCor()); // AZUL
    System.out.println(caneta01.getModelo()); // BIC 

    // Setters
    caneta01.setCor("preta");
    caneta.setModelo("Fabrica Castel");
  }

}
