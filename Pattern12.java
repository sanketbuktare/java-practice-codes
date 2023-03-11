/*
---pattern---
A  
B  C
C  D  E
D  E  F  G
*/
import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        int i = 1;
        while(i <= n) {
            int j = 1;
            while(j <= i) {
                System.out.print( (char)('A' + i + j -2) + "  ");
                j++;
            }
            System.out.print("\n");
            i++;
        }

        in.close();
    }

}
