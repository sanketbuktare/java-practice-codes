import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[100];
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the sum (sum of pairs): ");
        int sum = in.nextInt();

        printSumPairs(arr, size, sum);

        in.close();
    }

    public static void printSumPairs(int arr[], int n, int sum) {
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.printf("sum(%d, %d) = %d\n", arr[i], arr[j], sum);
                }
            }
        }
    }
}
