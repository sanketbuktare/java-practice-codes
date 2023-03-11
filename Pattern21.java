
/*
---pattern---
1  2  3  4  5  5  4  3  2  1  
1  2  3  4  *  *  4  3  2  1
1  2  3  *  *  *  *  3  2  1
1  2  *  *  *  *  *  *  2  1
1  *  *  *  *  *  *  *  *  1
*/
import java.util.*;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            int first = n - i + 1;
            while (first != 0) {
                System.out.print(j + "  ");
                first--;
                j++;
            }

            int second_1 = i - 1;
            while (second_1 != 0) {
                System.out.print("*  ");
                second_1--;
            }

            int second_2 = i - 1;
            while (second_2 != 0) {
                System.out.print("*  ");
                second_2--;
            }

            int third = n - i + 1;
            while (third != 0) {
                System.out.print(third + "  ");
                third--;
            }

            System.out.print("\n");
            i++;
        }

        in.close();
    }

}
