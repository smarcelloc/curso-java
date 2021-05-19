package arrays;

public class CriandoArraysDinamico {

    public static void main(String[] args) {
        int[] valores = new int[0];

        while (true) {
            try {
                valores[0] = 2;
                valores[1] = 3;
                valores[6] = 5;
                valores[12] = 300;
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                String mensagem = e.getMessage();
                String extrairMaxIndex = mensagem.replaceAll("(Index\\s)|(\\sout.*)", "");
                int maxIndexToInt = Integer.parseInt(extrairMaxIndex);
                valores = new int[maxIndexToInt + 1];
            }
        }

        int count = 1;
        // Imprimir Valoreds
        for (int elementos : valores) {
            System.out.println("[" + (count++) + "]:" + elementos);
        }
    }
}
