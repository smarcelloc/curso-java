package tratamentoErro.throwable;

public class TesteClass {
    public static void main(String[] args) throws Throwable {
        TesteClass gfg = new TesteClass();
        try {
            // calling this method will throw exception
            gfg.method();
        } catch (Exception e) {

            // Exception details without using fillInStackTrace()
            System.out.println("Exception details without fillInStackTrace()\n");
            System.err.println("Caught Inside Main:");
            //e.printStackTrace();

            // Exception details using fillInStackTrace()
            System.out.println("Exception details with fillInStackTrace()\n");
            System.err.println("Caught Inside Main:");
            e.fillInStackTrace();
            e.printStackTrace();
        }
    }

    // method calling divide operation
    public void method() throws Throwable {
        divide();
    }

    // divide operation throws ArithmeticException exception
    void divide() {

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            throw e;
        }
    }
}
