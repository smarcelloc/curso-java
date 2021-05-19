package arrays.dinamico;

import java.util.ArrayList;

public class VariosArrays {

    public static void main(String[] args) {
        // Declaração
        ArrayList<String> nomes01 = new ArrayList<>();
        ArrayList<String> nomes02 = new ArrayList<>();
        
        nomes01.add("A");
        nomes01.add("B");
   
        nomes02.add("C");
        
        // RESULTADO
        // nomes01 [A,B]
        // nomes02 [C]
        
        
        // adicionar
        nomes02.addAll(nomes01); // nomes02: 0 = C; 1 = A; 2 = B;
        
        nomes01.addAll(1, nomes02); // nomes02: 0 = A; 1 = C;
       
       // Remover
       nomes02.removeAll(nomes01); // Se um elemento for igual será eliminado
       // suponha: nomes02 seria: [Z, X, V] e nome01 [V, W]
       // Resultado nomes02: [Z,X] (letra V contém no Array nomes02)
       
       // Outra forma de remover 
       nomes02.retainAll(nomes01); // Se o elemento NÃO for igual será eliminado
       // suponha: nomes02 seria: [Z, X, V] e nome01 [V, W]
       // Resultado nomes02: [V] (letra V contém no Array nomes02)
       
       // Clonar os arrays
       //ArrayList<String> nomes03 = (ArrayList<String>) nomes02.clone();
       //List<String> nomes04 = nomes01.subList(2, 4);
       
       // Se o array é igual ao outro array
       nomes01.equals(nomes02); // Retorna true ou false
    }
}
