
import java.util.Scanner;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter the array size: ");
        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        swap_0_1_2(arr, size);

        System.out.println("The sorted array is: ");
        printArray(arr, size);

        in.close();
    }

    public static void swap_0_1_2(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        int mid = 0;
        while (mid <= j) {
            // System.out.println(i + ",  " + j + ",  " + mid);
            switch (arr[mid]) {

                // If the element is 0
                case 0:
                    int temp = arr[i];
                    arr[i] = arr[mid];
                    arr[mid] = temp;
                    i++;
                    mid++;
                    break;

                // If the element is 1 .
                case 1:
                    mid++;
                    break;

                // If the element is 2
                case 2:
                    int temp_2 = arr[mid];
                    arr[mid] = arr[j];
                    arr[j] = temp_2;
                    mid++;
                    j--;
                    break;
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
