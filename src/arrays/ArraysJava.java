package arrays;
import java.util.Arrays;

public class ArraysJava {
    public static void main(String[] args) {
        imprimirValores();
        imprimirValoresArrays();
    }
    
    public static void formasDeclaracaoDeArray(){
        int[] idades = { 0, 1, 2, 3, 4 };
        int[] anos = new int[3];
        int[] valores = new int[0];
    }
    
    public static void imprimirValores(){
        String[] nomes = {
            "Lucas", "Marcelo", "Júlia", "Rodrigo", "Bernado", "Fábio"
        };
        
        System.out.println("1 - Loop Normal");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        
        System.out.println("2 - ForEach");
        for(String elemento: nomes){
            System.out.println(elemento);
        }
    }
    
    
    public static void imprimirValoresArrays(){
        String[] nomes = {
            "Lucas", "Marcelo", "Júlia", "Rodrigo", "Bernado", "Fábio"
        };
        
        System.out.println("BIBLIOTECA ARRAYS");
        
        System.out.println("1 - Forma: toString()");
        System.out.println(Arrays.toString(nomes));
        
        System.out.println("2 - Forma: ForEACH");
        Arrays.stream(nomes).forEach(System.out::println);
        
        System.out.println("3 - Forma: asList");
        System.out.println(Arrays.asList(nomes));
    }
}
