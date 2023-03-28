import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = in.nextInt();
        int arr[] = new int[100];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter your choice: \n1. Ascending\n2. Descending");
        int option = in.nextInt();
        sortArray(arr, size, option);

        System.out.println("Sorted array is: ");
        printArray(arr, size);

        in.close();
    }

    public static void sortArray(int arr[], int n, int opt) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (opt == 1 && arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (opt == 2 && arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
