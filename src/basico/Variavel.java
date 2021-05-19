package basico;

public class Variavel {
    
    // constantes
    private final int EXIT = 0;
    
    public void tiposPrimitivos(){
        
        // Constantes
        final double PI = 3.14159265359;
        
        // Inteiros
        int v_int = 12000000;
        short v_short = 10323;
        long v_long = 1992321L;
        byte v_byte = 127;

        // Real
        double v_double = 12.23;
        float v_float = 1.23f;

        // Caracteres
        char v_char = 's';

        // Lógico
        boolean v_boolean = true;
    }
    
    public void tiposReferenciais(){
        Integer vr_integer = 122;
        Long vr_long = 29322L;
        Short vr_short = 12002;
        Byte vr_byte = 123;

        Float vr_float = 120.23f;
        Double vr_double = 123.233;

        Boolean vr_boolean = false;

        String vr_string = "okasd";
        Character vr_character = 'f';
    }
    
    public static void tamanhoDeBytes(){
        System.out.println("Char: " + Character.BYTES + " Byte(s)");
        System.out.println("Boolean: true / false");
        System.out.println("Int: " + Integer.BYTES + " Byte(s)");
        System.out.println("Double: " + Double.BYTES + " Byte(s)");
        
        String nome = "MARCELLO";
        int qtdDeLetraNome = nome.length();
        int bytesStringNome = qtdDeLetraNome * 2;
        System.out.print("Palavra: " + nome);
        System.out.print(" Qtd de Letras: " +  qtdDeLetraNome);
        System.out.print(" TAM. DO Bytes: " + bytesStringNome);
        System.out.println();
    }
    
    public static void variavelMaxMin(){
        System.out.println("\n\nTipos de dados em Java:");
        
        System.out.println("Menor Byte: " + Byte.MIN_VALUE);
        System.out.println("Maior Byte: " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("Menor Short Int: " + Short.MIN_VALUE);
        System.out.println("Maior Short Int: " + Short.MAX_VALUE);
        System.out.println();
        System.out.println("Menor Int: " + Integer.MIN_VALUE);
        System.out.println("Maior Int: " + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("Menor Long: " + Long.MIN_VALUE);
        System.out.println("Maior Long:" + Long.MAX_VALUE);
        System.out.println();
        System.out.println("Menor Float: " + Float.MIN_VALUE);
        System.out.println("Maior Float: " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("Menor Double: " + Double.MIN_VALUE);
        System.out.println("Maior Double: " + Double.MAX_VALUE);
    }
    
    public static void main(String[] args) {
        tamanhoDeBytes();
        variavelMaxMin();
    }
}
