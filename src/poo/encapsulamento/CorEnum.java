package poo.encapsulamento;

public enum CorEnum {
    
    AZUL("Azul"), 
    PRETA("Preta"), 
    VERMELHA("Vermelha");
    
    private final String VALOR;
    
    CorEnum(String valor){
        this.VALOR = valor;
    }

    public String getValor() {
        return this.VALOR;
    }
}
