import java.util.Scanner;

public class OccurenceBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[100];
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("What do you want to find: \n1. First Position\n2. Last Position\n3. Total number of Occurences");
        int opt = in.nextInt();

        System.out.println("Enter the key you want to search: ");
        int key = in.nextInt();

        switch(opt) {
            case 1:
                System.out.printf("First Position of %d is at Index: %d", key, firstOcc(arr, size, key));
                break;
            case 2:
                System.out.printf("Last Position of %d is at Index: %d", key, lastOcc(arr, size, key));
                break;
            case 3:
                System.out.printf("Total number of occurences of %d are: %d", key, totalOcc(arr, size, key));
                break;
            default:
                System.out.println("The Option is NOT valid!");
                break;
        }

        in.close();
    }

    public static int firstOcc(int arr[], int n, int key) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                ans = mid;
                e = mid - 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    public static int lastOcc(int arr[], int n, int key) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static int totalOcc(int arr[], int n, int key) {
        int fOcc = firstOcc(arr, n, key);
        int lOcc = lastOcc(arr, n, key);
        int ans = lOcc - fOcc + 1;
        return ans;
    }
}
