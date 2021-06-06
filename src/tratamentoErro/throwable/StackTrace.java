/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoErro.throwable;

/**
 *
 * @author marcello
 */
public class StackTrace {

    public static void main(String[] args) throws Exception {
        try {
            Exceptiontest();
        } catch (Throwable e) {
            //e.printStackTrace();
            // access to the stack trace
            StackTraceElement[] trace = e.getStackTrace();
            System.out.println("StackTraceElement length :" + trace.length);
            for (int i = 0; i < trace.length; i++) {
                System.out.println("Stack Trace at index " + i + " : " + trace[i]);
            }
        }
    }

    // method which throws Exception
    public static void Exceptiontest() throws Exception {
        ArrayStoreException ex = new ArrayStoreException();

        StackTraceElement[] trace = new StackTraceElement[]{
            new StackTraceElement("ClassName1", "methodName1",
            "fileName1", 10),
            new StackTraceElement("ClassName2", "methodName2",
            "fileName2", 20),
            new StackTraceElement("ClassName3", "methodName3",
            "fileName3", 14)
        };

        ex.setStackTrace(trace);
        throw ex;
    }
}
