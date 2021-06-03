package tratamentoErro;

public class TryCatch {

    public static void main(String[] args) {
        //normal();
        //comCatch();
        //cadeiaCatch();
        comCatchFinally();
    }

    public static void normal() {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!
        /*
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
            Index 10 out of bounds for length 3
         */
    }

    public static void comCatch() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Catch: Something went wrong.");
        }
    }

    public static void comCatchFinally() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Catch: Something went wrong.");
        } finally {
            System.out.println("Finally: The 'try catch' is finished.");
        }
    }

    public static void cadeiaCatch() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (ArithmeticException | ArrayStoreException e) {
            System.out.println("teste01");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("teste02");
        } catch(Exception e) {
            System.out.println("teste03");
        }
    }

}
