import java.util.Scanner;

public class Sort_0_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter the array size: ");
        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        swap_0_1(arr, size);

        printArray(arr, size);

        in.close();
    }

    public static void swap_0_1(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
