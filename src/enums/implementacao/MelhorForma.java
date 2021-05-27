package enums.implementacao;

enum CorEnum {
    
    AZUL("Azul"), 
    PRETA("Preta"), 
    VERMELHA("Vermelha");
    
    final String VALOR;
    
    CorEnum(String valor){
        this.VALOR = valor;
    }

    String getValor() {
        return this.VALOR;
    }
}

public class MelhorForma {
    public static void main(String[] args) {
        System.out.println(CorEnum.AZUL.getValor());
    }
}
