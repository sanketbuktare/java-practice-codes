/*
---pattern---
               1    
          2    3
     4    5    6
7    8    9    10
*/
import java.util.*;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        int i = 1;
        int count = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j < n- i + 1) {
                    System.out.print("     ");
                } else {
                    System.out.print(count + "    ");
                    count++;
                }
                j++;
            }
            System.out.print("\n");
            i++;
        }

        in.close();
    }

}
