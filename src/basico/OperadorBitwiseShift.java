package basico;

public class OperadorBitwiseShift {
    
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 2;
        
        mostrarEmBinario(n1);
        System.out.println();
        
        System.out.println("BIT NOT (~)");
        bitBitNot(n1);
        
        System.out.println("\n");
        
        System.out.println("POSITIVOS");
        positivo(n1, n2);
        
        System.out.println("\n");
        
        System.out.println("NEGATIVOS");
        negativo(n1, n2);
    }
    
    
    public static void mostrarEmBinario(int x){
        String binarioX = Integer.toBinaryString(x);
        System.out.println("Binário de " + x + ":\t " + binarioX);

    }
    
    public static void bitBitNot(int x) {
        System.out.println("~" + x + " = " + (~x));
        mostrarEmBinario(~x);
    }
    
    public static void positivo(int n1, int n2){
        // BIT-A-BIT A ESQUERDA
        int bitBitEsquerda = n1 << n2;
        System.out.println(n1 + " << " + n2 + " = " + bitBitEsquerda);
        mostrarEmBinario(bitBitEsquerda);
        
        System.out.println();
        
        // BIT-A-BIT A DIREITA
        int bitBitDireita = n1 >> n2;
        System.out.println(n1 + " >> " + n2 + " = " + bitBitDireita);
        mostrarEmBinario(bitBitDireita);
        
        System.out.println();
        
        // >>>
        int bitBitDireitaDireita = n1 >>> n2;
        System.out.println(n1 + " >>> " + n2 + " = " + bitBitDireitaDireita);
        mostrarEmBinario(bitBitDireitaDireita);
    
    }
    
    public static void negativo(int n1, int n2){
        int n1Menos = n1 * -1;
        
        // BIT-A-BIT A ESQUERDA
        int bitBitEsquerda = n1Menos << n2;
        System.out.println(n1Menos + " << " + n2 + " = " + bitBitEsquerda);
        mostrarEmBinario(bitBitEsquerda);
        
        System.out.println();
        
        // BIT-A-BIT A DIREITA
        int bitBitDireita = n1Menos >> n2;
        System.out.println(n1Menos + " >> " + n2 + " = " + bitBitDireita);
        mostrarEmBinario(bitBitDireita);
        
        System.out.println();
        
        // >>> (Não existe)
        System.out.println(n1Menos + " >>> " + n2 + " = "
                + "Não existe >>> para valores negativos");
    }
            
}
