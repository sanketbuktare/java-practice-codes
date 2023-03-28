import java.util.Scanner;

public class MaxMin {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = in.nextInt();

        int []arr = new int[100];
        for (int i = 0; i< size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Max number is: " + getMax(arr, size));
        System.out.println("Min number is: " + getMin(arr, size));

        in.close();
    }

    public static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int arr[], int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
