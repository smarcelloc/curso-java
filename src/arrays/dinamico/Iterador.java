package arrays.dinamico;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernando");
        nomes.add("Taís");
        nomes.add("Kaio");

        Iterator<String> iNomes = nomes.iterator();

        System.out.println("Uso de ITERADOR GERADOR");
        while (iNomes.hasNext()) { // hasnext: TRUE que existe um próximo e FALSE chegou ao fim
            // Next: informar o valor e incrementar para o próximo elemento
            System.out.println(iNomes.next());
        }

        System.out.println("\nUso de ITERADOR IMPLÍCITO");
        nomes.forEach(iterador -> {
            System.out.println(iterador);
        });
    }
}
