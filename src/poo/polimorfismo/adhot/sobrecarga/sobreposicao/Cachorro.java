package poo.polimorfismo.adhot.sobrecarga.sobreposicao;

// POLIMORFISMO - ADHOT -> SOBRECARGA

// POLIMORFISMO - ADHOT -> SOBRECARGA -> SOBREPOSIÇÃO
// SOBRECARGA = ASSINATURA DO MÉTODO É IGUAIS
// OU SEJA, O MÉTODO (@OVERRIDE) CACHORRO E ANIMAL TEM O MESMO TIPO E A MESMA ORDEM 

public class Cachorro extends Animal{
    private String raca;
    
    @Override
    public void movimentar(Double correr, String tipo) {
        System.out.println("Correr: " + correr);        
        System.out.println("Tipo: " + tipo);
    }
}
