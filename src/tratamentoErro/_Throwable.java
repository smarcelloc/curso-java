package tratamentoErro;

public class _Throwable {

    public static void main(String[] args) throws Exception {
        try {
            testException();
        } catch (Throwable e) {
            System.out.println(e.toString());            
            System.out.println(e.getMessage());
        }
    }

    public static void testException() throws Exception {
        throw new Exception("New Exception Thrown");
    }
}
