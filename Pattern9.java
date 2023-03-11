
/*
---pattern---
A  B  C  D  
B  C  D  E
C  D  E  F
D  E  F  G
*/
import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        // Method 1
        // usingVar(n);

        // Method 2
        withoutVar(n);

        in.close();
    }

    public static void usingVar(int n) {
        int i = 1;
        char count = 'A';
        while (i <= n) {
            int j = 1;
            char colCount = count;
            while (j <= n) {
                System.out.print(colCount + "  ");
                colCount = (char) (colCount + 1);
                j++;
            }
            count = (char) (count + 1);
            System.out.print("\n");
            i++;
        }
    }

    public static void withoutVar(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print((char) ('A' + i + j - 2) + "  ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

}
