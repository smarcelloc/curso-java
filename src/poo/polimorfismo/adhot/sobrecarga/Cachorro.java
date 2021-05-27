package poo.polimorfismo.adhot.sobrecarga;

// POLIMORFISMO - ADHOT -> SOBRECARGA
// SOBRECARGA = ASSINATURA DO MÉTODO É DIFERENTE
// OU SEJA, O MÉTODO (sem isso @OVERRIDE) CACHORRO E ANIMAL TEM O DIFERENTE TIPO E ORDEM DIFERENTE 

public class Cachorro extends Animal{
    private String raca;

    //@Override
    public void movimentar(String acao) {
        System.out.println("Correr: " + acao);        
    }
}
