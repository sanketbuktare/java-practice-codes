
/*
---pattern---
*  *  *  *  
*  *  *
*  *
*
*/
import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        // Method 1
        // m1(n);

        // Method 2
        m2(n);
        in.close();
    }

    public static void m1(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j > (n - i + 1)) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

    public static void m2(int n) {
        int i = 1;
        while (i <= n) {
            int star = (n - i + 1);
            while (star != 0) {
                System.out.print("*  ");
                star--;
            }
            System.out.print("\n");
            i++;
        }
    }

}
