package tratamentoErro;

public class MetodoException {

    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage()); // Mensagem de erro traduzida
            System.out.println(e.getMessage()); // Mensagem de erro
            System.out.println(e.getStackTrace()[0].getClassName());
            System.out.println(e.getStackTrace()[0].getFileName());
            System.out.println(e.getStackTrace()[0].getMethodName());
            System.out.println(e.getStackTrace()[0].isNativeMethod());
            System.out.println(e.getStackTrace()[0].getModuleName());
            System.out.println(e.getStackTrace()[0].getModuleVersion());
        }
    }
}
