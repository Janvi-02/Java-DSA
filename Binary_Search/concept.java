package Binary_Search;
import java.util.*;
// in this program
// Since we sort the array first:
// Sorting: O(n log n)
// Binary Search: O(log n)
// Total: O(n) + O(n log n) + O(log n)
// Therefore, total Time Complexity = O(n log n)
public class concept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i =0;i<n;i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);      // time Complexity: O(n log n)
        int key = sc.nextInt();
        System.out.println(binarySearch(num,key));

    }
    static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
