package basico;

public class OperadorBinario {
    public static void main(String[] args) {
        int n1 = 30;
        int n2 = 20; 
        
        // Transformar em binário n1 e n2
        String binarioN1 = Integer.toBinaryString(n1);
        String binarioN2 = Integer.toBinaryString(n2);
        System.out.println("Valor: " + n1 + " Binário: " + binarioN1);
        System.out.println("valor: " + n2 + " Binário: " + binarioN2);
        
        System.out.println("\n");
        
        
        // Operador Binário E (&)
        int e = n1 & n2;
        String binarioE = Integer.toBinaryString(e);
        System.out.println("Valor n1 & n2: " + e + " Binário: " + binarioE);
        
        // Operador Binário OU (|)
        int ou = n1 | n2;
        String binarioOu = Integer.toBinaryString(ou);
        System.out.println("Valor n1 | n2: " + ou + " Binário: " + binarioOu);
        
        // Operador binário ^ (Ou .. Ou, também chamado -> Ou Exclusivo) 
        int ou_ou = n1 ^ n2;
        String binarioOu_Ou = Integer.toBinaryString(ou_ou);
        System.out.println("Valor n1 ^ n2: " + ou_ou + " Binário: " + binarioOu_Ou);
    }
}
