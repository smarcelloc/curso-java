package array;

public class Foreach {
  public static void main(String[] args) {
    declararValores();
  }

  public static void declararValores() {
    int[] v01 = new int[3];
    int[] v02 = { 1, 2, 3 };
    int[] v03 = new int[] { 1, 2, 3 };

    v01[0] = 1;
    v01[1] = 2;
    v01[2] = 3;

    /// FOREACH
    System.out.println("USO DO PRIMEIRO FOR com INICIALIZAÇÃO INT I = 0");
    for (int i = 0; i < v01.length; i++) {
      System.out.println(v01[i]);
    }

    System.out.println("USO DO PRIMEIRO FOR SEM INICIALIZAÇÃO");
    for (int elemento : v02) {
      System.out.println(elemento);
    }
  }
}
