package arrays.dinamico;

import java.util.ArrayList;

public class UmArrays {
    public static void main(String[] args) {
        // Declaração
        ArrayList<String> nomes = new ArrayList<String>();
        
        // Adicionar elemento
        nomes.add("Marcello");
        nomes.add(1, "Ricardo");
        
        // Remover elemento
        nomes.remove("Ricardo"); // objeto
        nomes.remove(1); // index
        nomes.removeIf(elemento -> (elemento.charAt(0) == 'R'));
        
        // Alterar elemento
        nomes.set(1, "Felipe"); // paramêtro: index, objeto
        
        // Consultar
        // Existência do elemento no Arrays
        nomes.contains("Rodrigo"); // True ou False
        
        // Código do HASH do Array
        // Verficar a integridade do Array se não houve altera de valores
        nomes.hashCode(); // retorna INT 
        
        // Tamanho de elemento do Array
        nomes.size(); // retorna int

        // Limpar os elementos do Arrays
        nomes.clear();
        
        // Verificar se o Array está vázio
        nomes.isEmpty(); // retorna true / false
        
        // RETORNAR O INDEX DO ELEMENTO
        // Suponha que o nome de RICARDO esteja no index:
        // [3] - RICARDO; [5] - RICARDO; [10] RICARDO 
        // Retornar o index do PRIMEIRO elemento
        nomes.indexOf("Ricardo"); // Retorna (INT) 3
        // Retornar o index do ÚLTIMO elemento
        nomes.lastIndexOf("Ricardo"); // Retorna (INT) 10
    }
    
}
