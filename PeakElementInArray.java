import java.util.Scanner;

public class PeakElementInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[100];
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int peak = getPeakElem(arr, size);
        System.out.println("Peak element is at Index: " + peak);

        in.close();
    }

    public static int getPeakElem(int arr[], int n) {
        int s = 0;
        int e = n-1;
        while(s<e) {
            int mid = s + (e-s)/2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }
}
