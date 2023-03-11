
/*
---pattern---
         1  
      1  2  1
   1  2  3  2  1
1  2  3  4  3  2  1
*/
import java.util.*;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        int i = 1;
        while (i <= n) {
            // Printing spaces
            int space = n - i;
            while (space != 0) {
                System.out.print("   ");
                space--;
            }

            // Printing 1st pattern
            int j = 1;
            while (j <= i) {
                System.out.print(j + "  ");
                j++;
            }

            // Printing 2nd pattern
            int count = i - 1;
            while (count != 0) {
                System.out.print(count + "  ");
                count--;
            }

            System.out.print("\n");
            i++;
        }

        in.close();
    }

}
