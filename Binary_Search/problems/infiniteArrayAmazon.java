package Binary_Search.problems;

public class infiniteArrayAmazon {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(result(arr, target));
    }

    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end +1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
// Another method to exponentially increase the window size and finding the lower and upper bound to find the target and this solution is also optimised but " ans " function is still structurally better and cleaner.
    static int result(int[] arr,int target){
        int start = 0;
        int end = 1;
        boolean searchingForBounds = true;
        if(target<arr[start]){
            return -1;
        }
        int i = 1;
        while(searchingForBounds){      // Makes logical sense rather just naming it as targetFound which sounds like we already found the target
            // the computer doesn't care what you name it but if any another person reads your code it should make sense in english so that's why we give meaningful names to our variables
            if(target<=arr[end]){
                searchingForBounds = false;
            }
            else{
                start = end+1;
                end = end + (1 << ++i); // << left shift operator needs operands ont both sides like +,-,*,/
                // << does the same as 2^i where i is first increasing then left shift makes the power of 2
                // 1<< ++i = 1 * (2^i)
            }
        }
        return binarySearch(arr,target,start,end);
    }
}
