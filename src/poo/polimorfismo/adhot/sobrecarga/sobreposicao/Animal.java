package poo.polimorfismo.adhot.sobrecarga.sobreposicao;

public abstract class Animal {
    private String nome;
    private Integer idade;
    
    public void movimentar(Double velocidade, String mode){
        System.out.println("Velocidade" + velocidade);
        System.out.println("Modo" + mode);

    }
}
