package tratamentoErro;

public class ThrowTratar {

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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("OK");
        }
    }
}
