// Function that returns nth term of AP = 3n + 7

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Given A.P.: is 3n + 7\n To find nth term enter n: ");
        int n = in.nextInt();
        int ans = AP(n);
        System.out.printf("%dth term is %d", n, ans);

        in.close();
    }

    public static int AP(int n) {
        return (3 * n + 7);
    }
}
