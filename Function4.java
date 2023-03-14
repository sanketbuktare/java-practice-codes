// Function that returns total number of set bits in two numbers

import java.util.Scanner;

public class Function4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a: ");
        int n1 = in.nextInt();

        System.out.println("Enter b: ");
        int n2 = in.nextInt();

        int ans = countSetBits(n1, n2);
        System.out.printf("Total no. of bits in %d and %d are %d", n1, n2, ans);

        in.close();
    }

    public static int countSetBits(int a, int b) {
        int count = 0;
        while (a != 0) {
            int bit_a = a & 1;
            if (bit_a == 1) {
                count = count + 1;
            }
            a = a >> 1;
        }

        while (b != 0) {
            int bit_b = b & 1;
            if (bit_b == 1) {
                count = count + 1;
            }
            b = b >> 1;
        }

        return count;
    }
}
