/*
---pattern---
A  B  C  D  
A  B  C  D
A  B  C  D
A  B  C  D
*/
import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        int i = 1;
        while(i <= n) {
            int j = 1;
            while(j <= n) {
                System.out.print((char)('A' + j - 1) + "  ");
                j++;
            }
            System.out.print("\n");
            i++;
        }

        in.close();
    }
}
