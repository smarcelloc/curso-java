package poo.relacionamento.exercicio;

public enum CategoriaLutadorEnum {
    PESADO("Pesado"),
    MEDIO("Médio"),
    LEVE("Leve"),
    INVALIDA("Inválida");
    
    private String valor;

    private CategoriaLutadorEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
