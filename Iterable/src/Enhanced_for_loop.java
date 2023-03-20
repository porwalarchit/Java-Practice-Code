import java.util.*;

public class Enhanced_for_loop {
    public static void main(String[] args) {
        int[][] squares = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                squares[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("Printing elements of a 2D array using for-each loop");
        for (int[] rows : squares) {
            for (int column : rows) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
