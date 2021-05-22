package poo.exerciciofinal;

import java.util.Random;

public class Lutas implements LutasInterface {

    private Lutador desafiante;
    private Lutador desafiado;
    private Integer rounds;
    private Boolean aprovado;

    public Lutas(Lutador desafiante, Lutador desafiado) {
        this.validarLuta(desafiante, desafiado);
        if (this.aprovado) {
            this.desafiante = desafiante;
            this.desafiado = desafiado;
        }
    }

    // Métodos especiais
    public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    // Métodos públicos
    @Override
    public void luta() {
        if (!this.aprovado) {
            System.out.println("Luta reprovado!");
        } else {
            System.out.println("---- DESAFIANTE ----");
            this.desafiado.apresentar();
            System.out.println("\n---- DESAFIANTE ----");
            this.desafiante.apresentar();

            this.sistemaDeLuta();

            System.out.println("\nCLASSIFICAÇÃO ATUAL");
            this.desafiado.status();
            this.desafiante.status();
        }
    }

    // Métodos privados
    private void validarLuta(Lutador desafiante, Lutador desafiado) {
        if (desafiante.getCategoria() == desafiado.getCategoria()) {
            this.aprovado = (desafiado != desafiante);
        }else{
            this.aprovado = false;
        }
    }

    private void sistemaDeLuta() {
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(3); // 0 1 2 3

        switch (resultado) {
            case 1:
                System.out.println("O DESAFIADO GANHOU A LUTA: " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                System.out.println("O DESAFIANTE GANHOU A LUTA: " + this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;
            default:
                System.out.println("LUTA EMPATA");
                this.desafiado.empateLuta();
                this.desafiante.empateLuta();
        }
    }

}
