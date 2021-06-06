package tratamentoErro._throws;

public class ClasseA {
    public static void main(String[] args) {
        try {
            ClasseB classeB = new ClasseB();
            classeB.checkAge(12);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
