package poo.exerciciofinal;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Lutador> lutadores = CadastrarLutadores.getLutadores();
        Lutas lutas = new Lutas(
                lutadores.get(0),
                lutadores.get(1)
        );
        
        lutas.luta();
    }

}
