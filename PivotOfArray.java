import java.util.Scanner;

public class PivotOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[100];
        System.out.println("Enter size of array: ");
        int size = in.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int pivot = findPivot(arr, size);
        System.out.printf("Pivot of array is at index: %d", pivot);

        in.close();
    }

    public static int findPivot(int arr[], int n) {
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return s;
    }
}
