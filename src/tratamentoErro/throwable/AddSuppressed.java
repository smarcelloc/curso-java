package tratamentoErro.throwable;

import javax.security.auth.login.AccountException;

public class AddSuppressed {

    // Main Method
    public static void main(String[] args) throws Exception {
        try {
            testException();
        } catch (Throwable e) {
            System.out.println("Suppressed Exceptions:");
            for (Throwable suppExe1 : e.getSuppressed()) {
                System.out.println(suppExe1);
            }
        }
    }

    // method which throws Exception
    public static void testException() throws Exception {

        // creating a IOException object
        final Exception exe = new Exception();

        // adding suppressed Exception
        // using addSuppressed method
        exe.addSuppressed(new ArithmeticException());
        exe.addSuppressed(new NullPointerException());
        exe.addSuppressed(new AccountException());
        // throwing IOException
        throw exe;
    }
}
