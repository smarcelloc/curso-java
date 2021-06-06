package tratamentoErro;

public class StackTrace {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Acesso negado - somente maiores de 18 anos");
        } else {
            System.out.println("Permido");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // Set age to 15 (which is below 18...)
        } catch (Throwable e) {
            for (StackTraceElement es : e.getStackTrace()) {
                System.out.println(es.getFileName());
                System.out.println(es.getClassName());
                System.out.println(es.getMethodName());
                System.out.println(es.getModuleName());
                System.out.println(es.getModuleVersion());
            }
        }
    }
}
