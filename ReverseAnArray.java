import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = in.nextInt();

        int arr[] = new int[100];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        // function that prints reverse of an array
        reverseArray(arr, size);

        in.close();
    }

    public static void reverseArray(int arr[], int n) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}