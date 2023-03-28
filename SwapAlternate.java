import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = in.nextInt();

        int arr[] = new int[100];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        swapAlt(arr, size);

        in.close();
    }

    public static void swapAlt(int arr[], int n) {
        int start = 0;
        while (start < n - 1) {
            int temp = arr[start];
            arr[start] = arr[start + 1];
            arr[start + 1] = temp;
            start += 2;
        }

        System.out.println("Swapped array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
