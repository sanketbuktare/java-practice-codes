import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = in.nextInt();
        int arr[] = new int[100];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Sum of all elements of array = " + arraySum(arr, size));

        in.close();
    }

    public static int arraySum(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
