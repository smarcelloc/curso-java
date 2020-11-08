package array;

public class Array {
    public static void run() {
        // teste01();
        declaracaoArray();
    }

    public static void teste01() {
        int[] idades = { 0, 1, 2, 4 };

        for (int elemento : idades) {
            System.out.println(elemento);
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }

    public static void declaracaoArray() {
        int[] idades = { 0, 1, 2, 3, 4 };
        int[] anos = new int[3];

        int[] valores = new int[0];

        do {
            try {
                valores[0] = 2;
                valores[1] = 3;
                valores[6] = 5;
                valores[12] = 300;
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                String mensagem = e.getLocalizedMessage();
                String replaceMensagemNumero = (mensagem).replaceAll("(Index\s)|(\sout.*)", "");
                int maxDoIndex = Integer.parseInt(replaceMensagemNumero);

                valores = new int[maxDoIndex + 1];
            }
        } while (true);

        int x = 1;
        for (int elementos : valores) {
            System.out.println("[" + (x++) + "]:" + elementos);
        }
    }
}
