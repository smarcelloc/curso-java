package app;

public class Variavel {
    public static void main(String[] args) {
        // Tipos Primitivos
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

        // --------------------------------------------------------------------
        // Tipos Referenciais
        Integer vr_integer = 122;
        Long vr_long = 29322L;
        Short vr_short = 12002;
        Byte vr_byte = 123;

        Float vr_float = 120.23f;
        Double vr_double = 123.233;

        Boolean vr_boolean = false;

        String vr_string = "okasd";
        Character vr_character = 'f';

        System.out.println("Char: " + Character.BYTES + " Byte(s)");
        System.out.println("Boolean: true / false");
        System.out.println("Int: " + Integer.BYTES + " Byte(s)");
        System.out.println("Double: " + Double.BYTES + " Byte(s)");
        String nome = "MARCELLO";
        System.out.println("Palavra: MARCELLO " + nome.length() * 2 + " Byte(s)");

    }

    // Consumo de memória da Minha Aplicação
    // System.out.println("MiNHA Aplicação Consome de memória: ");
    // Runtime runtime = Runtime.getRuntime();
    // System.out.println("Memória Livre: " + runtime.freeMemory());
    // System.out.println("max Memória: " + runtime.maxMemory());
    // Long memoriaConsumida = runtime.maxMemory() - runtime.freeMemory();
    // System.out.println("Memória Consumida: " + memoriaConsumida);

    // System.out.println("Nº de processo: " + runtime.availableProcessors());

    // System.out.println("Char:" + instanceof char);
}