package tratamentoErro;

public class C_Throw {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Acesso negado - somente maiores de 18 anos");
        } else {
            System.out.println("Permido");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
    }
}
