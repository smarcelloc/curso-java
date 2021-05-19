package arrays;

import java.util.Arrays;

public class Multidimensional {

    public static void main(String[] args) {
        foreach01();
    }

    public static void declaracao() {
        int[][] dias = new int[31][12];
        int[] dias02[] = new int[31][12];

        dias[1] = new int[4];

        dias[0][1] = 12;
        dias[0][2] = 21;
        dias[0][3] = 23;

        dias[1] = new int[]{12, 21, 23};
    }

    public static void foreach01() {
        int[][] intArray = new int[3][3];
        intArray[0] = new int[]{00, 01, 02};
        intArray[1] = new int[]{10, 11, 12};
        intArray[2] = new int[]{20, 21, 22};

        System.out.println("1 - Forma: Normal");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println(intArray[i][j]);
            }
        }

        System.out.println("2 - Forma: ForEach");
        for (int[] i : intArray) {
            for (int j : i) {
                System.out.println(j);
            }
        }
        
        // Uso da biblioteca Arrays
        System.out.println("3 - Forma: Biblioteca Arrays");
        System.out.println(Arrays.deepToString(intArray));
    }
}
