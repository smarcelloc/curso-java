package tratamentoErro._throws;

public class ClasseB {
    public void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Acesso negado - somente maiores de 18 anos");
        } else {
            System.out.println("Permido");
        }
    }
}