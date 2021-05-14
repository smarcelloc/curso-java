package basico;

public class OperadorMatematica {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 2;
        
        System.out.println("NÚMERO 1: " + n1);
        System.out.println("NÚMERO 2: " + n2);
        
        System.out.println();
        
        System.out.println("SOMA: " + (n1 + n2));
        System.out.println("SUBTRAÇÃO: " + (n1 - n2));
        System.out.println("MULTIPLICAÇÃO: " + (n1 * n2));
        System.out.println("DIVISÃO: " + (n1 / n2));
        System.out.println("RESTO DA DIVISÃO: " + (n1 % n2));
        
        System.out.println("POTÊNCIA: " + Math.pow(n1, n2));
        System.out.println("RAIZ QUADRADA DE "+ n1 +" : " + Math.sqrt(n1));
        System.out.println("RAIZ CÚBICA DE " + n1 + " : " + Math.cbrt(n1));
        System.out.println("QUAL VALOR MÁXIMO " + n1 + " OU " + n2 + ": " + Math.max(n1, n2));
        System.out.println("QUAL VALOR MÍNIMO " + n1 + " OU " + n2 + ": " + Math.min(n1, n2));
    }
}
