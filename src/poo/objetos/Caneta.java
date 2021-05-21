package poo.objetos;

public class Caneta {

    String modelo;
    CorEnum cor;
    Float ponta;
    Integer carga;
    Boolean tampada;

    Caneta() {}

    Caneta(String modelo, CorEnum cor, Float ponta, Integer carga, Boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    void status(){
        System.out.println("\n-> CANETA");
        System.out.println("---> Modelo: " + this.modelo);
        System.out.println("---> Cor: " + cor.getValor());
        System.out.println("---> Tampado: " + (this.tampada ? "SIM" : "NÃO"));
        System.out.println("---> Ponta: " + this.ponta);
        System.out.println("---> Carga: " + this.carga);
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void rabiscar(String rabisco){
        if(!this.tampada){
            System.out.println("RABISCO:" + rabisco);
        }else{
            System.out.println("Ops! Para rabiscar precisa destampar a caneta");
        }
    } 
}
