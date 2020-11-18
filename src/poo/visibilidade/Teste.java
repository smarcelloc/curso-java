package poo.visibilidade;

public class Teste {

  public static void run() {
    Caneta caneta = new Caneta();
    //caneta.modelo = "BIC" // private ERRO
    //caneta.cor = "BIC" // private ERRO
    caneta.carga = 12; // protected
    caneta.ponta  = 21f; // protected
    caneta.tampada = true; // public
    caneta.rabiscar("OK"); // public
    caneta.desenhar(); // protected
    //caneta.pintar(); // private ERRO
  }
}
