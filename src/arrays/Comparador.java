package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparador {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Marcelo");
        nomes.add("Ricardo");
        nomes.add("Georgetown");
        nomes.add("Vanessa");
        nomes.add("Lucas");
        
        System.out.println("Uso em ORDER ALFABÉTICA");
        nomes.sort(null);
        System.out.println(nomes.toString());

        System.out.println("\nUso em ORDER ALFABÉTICA (INVERSO)");
        nomes.sort(null);
        Collections.reverse(nomes); // inverter a ordem
        System.out.println(nomes.toString());

        System.out.println("\nUso em ORDER DESCRENTE DE MAIOR LETRA O NOME");
        nomes.sort(new ComparadorPorTamanho());
        System.out.println(nomes.toString());

    }
}

class ComparadorPorTamanho implements Comparator<String> {

    private final int PRIMEIROMOSTRAR = 1; // constantes
    private final int SEGUNDOMOSTRAR = -1; // constantes
    private final int EMPATE = 0; // constantes

    @Override
    public int compare(String s1, String s2) {

        if (s1.length() < s2.length()) {
            return PRIMEIROMOSTRAR;
        }

        if (s1.length() > s2.length()) {
            return SEGUNDOMOSTRAR;
        }

        return EMPATE;
    }

}
