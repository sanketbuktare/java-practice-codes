/*
---pattern---
A  A  A  A  
B  B  B  B
C  C  C  C
D  D  D  D
*/
import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();

        // Method 1
        // asciiFunc(n);

        // Method 2
        seriesFunc(n);

        in.close();
    } 
    
    public static void asciiFunc(int n) {
        int i = 1;
        int ascii = 65;
        while(i <= n){
            int j = 1;

            while(j <= n) {
                char ch = (char)ascii;
                System.out.print(ch + "  ");
                j++;
            }
            System.out.print("\n");
            ascii++;
            i++;
        }
    }

    public static void seriesFunc(int n) {
        int i = 1;
        while(i <= n){
            int j = 1;

            while(j <= n) {
                System.out.print((char)('A' + i - 1) + "  ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
