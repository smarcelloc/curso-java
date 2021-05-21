package poo.encapsulamento;

public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        
        caneta.setModelo("BIG");
        caneta.setCor(CorEnum.VERMELHA);
        caneta.setCarga(80);
        caneta.setPonta(0.5f);
        caneta.setTampada(true);
        
        caneta.destampar();
        caneta.status();
        
        
        caneta.rabiscar("Estou desenhando uma casa");
    }
}
