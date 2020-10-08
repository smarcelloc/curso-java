package app;

public class Operator {

    public static void main(String[] args) {
        // bitwise_shift();
        operadorDeBinario();
    }

    public static void bitwise_shift() {
        int x = 10;
        String binarioX = Integer.toBinaryString(x);
        System.out.println("Valor: " + x + " Binário: " + binarioX);

        // BIT-A-BIT A ESQUERDA
        int y = x << 2;
        String binarioY = Integer.toBinaryString(y);
        System.out.println("valor x << 2: " + y + " Binário: " + binarioY);

        // BIT-A-BIT A DIREITA
        int z = x >> 2;
        String binarioZ = Integer.toBinaryString(z);
        System.out.println("valor x >> 2: " + z + " Binário: " + binarioZ);

        // >>>
        int w = x >>> 2;
        String binarioW = Integer.toBinaryString(w);
        System.out.println("valor x >>> 2: " + w + " Binário: " + binarioW);
    }

    public static void operadorDeBinario() {

        int x = 13;
        int y = 10;

        String binarioX = Integer.toBinaryString(x);
        String binarioY = Integer.toBinaryString(y);

        System.out.println("Valor: " + x + " Binário: " + binarioX);
        System.out.println("valor: " + y + " Binário: " + binarioY);

        int z = x & y;
        String binarioZ = Integer.toBinaryString(z);
        System.out.println("Valor x & y: " + z + " Binário: " + binarioZ);

        int t = x | y;
        String binarioT = Integer.toBinaryString(t);
        System.out.println("Valor x | y: " + t + " Binário: " + binarioT);

        int u = x ^ y;
        String binarioU = Integer.toBinaryString(u);
        System.out.println("Valor x ^ y: " + u + " Binário: " + binarioU);
    }

}
