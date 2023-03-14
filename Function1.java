// Function that return the power of a number

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n1 = in.nextInt();
        System.out.println("Enter the power: ");
        int n2 = in.nextInt();

        int ans = power(n1, n2);

        System.out.printf("%d ^ %d = %d", n1, n2, ans);
        in.close();
    }

    public static int power(int a, int b) {
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        return ans;
    }
}
