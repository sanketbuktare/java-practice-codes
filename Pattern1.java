/*
---pattern---
1  2  3  4  
1  2  3  4
1  2  3  4
1  2  3  4
*/
import java.util.*;
public class Pattern1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j + "  ");
                j++;
            }
            System.out.print("\n");
            i++;
        }

        in.close();
    }
}
