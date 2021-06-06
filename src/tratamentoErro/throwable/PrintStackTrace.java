package tratamentoErro.throwable;

import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintStackTrace {

    // Main Method
    public static void main(String[] args) throws Exception {
        try {
            testException1();
        } catch (Throwable e) {
            
            e.printStackTrace();
            
            /*StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
  
            String error = sw.toString();
  
            System.out.println("Error:\n" + error);*/
            
            //e.printStackTrace(System.out);
        }
    }

    // method which throws Exception
    public static void testException1() throws Exception {
        Exception ioe = new Exception();
        
        ioe.initCause(new ArrayIndexOutOfBoundsException());
        throw ioe;
    }
}
