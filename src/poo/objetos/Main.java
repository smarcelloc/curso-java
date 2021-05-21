package poo.objetos;

public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        
        caneta.modelo = "BIG";
        caneta.cor = CorEnum.AZUL;
        caneta.carga = 80;
        caneta.ponta = 0.5f;
        caneta.tampada = true;
        
        caneta.status();
        
        
        caneta.destampar();
        caneta.status();
        
        
        caneta.rabiscar("Estou desenhando uma casa");
    }
}
