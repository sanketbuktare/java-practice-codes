/*
---pattern---
A  B  C  D  
E  F  G  H
I  J  K  L
M  N  O  P
*/
import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        int i = 1;
        char count = 'A';
        while(i <= n) {
            int j = 1;
            while(j <= n) {
                System.out.print(count + "  ");
                count = (char)(count + 1);
                j++;
            }
            System.out.print("\n");
            i++;
        }

        in.close();
    }

}
