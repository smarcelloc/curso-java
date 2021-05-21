package poo.encapsulamento;

public class Caneta implements CanetaInterface{

    // ATRBUTOS
    private String modelo;
    private CorEnum cor;
    private Float ponta;
    private Integer carga;
    private Boolean tampada;

    // CONSTRUTORES
    public Caneta() {}

    public Caneta(String modelo, CorEnum cor, Float ponta, Integer carga, Boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    // GET AND SET
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CorEnum getCor() {
        return cor;
    }

    public void setCor(CorEnum cor) {
        this.cor = cor;
    }

    public Float getPonta() {
        return ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Boolean getTampada() {
        return tampada;
    }

    public void setTampada(Boolean tampada) {
        this.tampada = tampada;
    }
    
    // METODOS PÚBLICOS
    @Override
    public void status(){
        System.out.println("\n-> CANETA");
        System.out.println("---> Modelo: " + this.modelo);
        System.out.println("---> Cor: " + cor.getValor());
        System.out.println("---> Tampado: " + (this.tampada ? "SIM" : "NÃO"));
        System.out.println("---> Ponta: " + this.ponta);
        System.out.println("---> Carga: " + this.carga);
    }
    
    @Override
    public void destampar(){
        this.tampada = false;
    }
    
    @Override
    public void tampar(){
        this.tampada = true;
    }
    
    @Override
    public void rabiscar(String rabisco){
        if(!this.tampada){
            System.out.println(this.exibirCor() + "RABISCO:" + rabisco + CorTerminal.END);
        }else{
            System.out.println("Ops! Para rabiscar precisa destampar a caneta");
        }
    }
    
    // MÉTODOS PRIVADOS
    private String exibirCor(){
        switch (this.cor) {
            case AZUL:
                return CorTerminal.BLUE;
            case VERMELHA:
                return CorTerminal.RED;
            case PRETA:
                return CorTerminal.BLACK;
            default:
                return "Este cor de caneta não existe";
        }
    }
}
