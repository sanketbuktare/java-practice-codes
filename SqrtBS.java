import java.util.Scanner;

public class SqrtBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to find square root: ");
        int num = in.nextInt();

        // int sqrt = find_sqrt_int(num);
        double sqrt_with_pre = find_sqrt_precision(num, 3);
        System.out.printf("Square root of %d = %.3f", num, sqrt_with_pre);

        in.close();
    }

    public static int find_sqrt_int(int num) {
        int ans = -1;
        int s = 0;
        int e = num;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid > num) {
                e = mid - 1;
            } else {
                s = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static double find_sqrt_precision(int num, int precision) {
        double ans = find_sqrt_int(num);
        double fact = 1;
        for (int i = 0; i < precision; i++) {
            fact = fact / 10;
            for (double j = ans; j * j < num; j = j + fact) {
                ans = j;
            }
        }

        return ans;
    }
}
