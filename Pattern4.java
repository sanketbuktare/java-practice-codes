
/*
---pattern---
1  
2  3
3  4  5
4  5  6  7
*/
import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            // int count = i;
            while (j < i) {
                System.out.print(i+j + "  ");
                // count++;
                j++;
            }
            System.out.print("\n");
            i++;
        }

        in.close();
    }
}
