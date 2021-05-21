package poo.objetos;

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
