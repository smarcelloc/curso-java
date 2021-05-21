package poo.relacionamento.dependencia;

public class Carro {
    private String cor;
    private String modelo;
    private String marca;
    
    // Adicionar classe RODA como um parametro
    public void andar(Roda roda){
        // A roda precisa da mesma marca ou genérica
        if(roda.getMarca().equals(this.marca)){
            System.out.println("Carro andando");
        }else{
            System.out.println("O carro não pode andar");
        }
    }
}
