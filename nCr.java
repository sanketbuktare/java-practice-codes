import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        System.out.println("Enter r: ");
        int r = in.nextInt();

        int ans = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.printf("C(%d, %d) = %d", n, r, ans);
        in.close();
    }

    public static int factorial(int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul = mul * i;
        }
        return mul;
    }
}
