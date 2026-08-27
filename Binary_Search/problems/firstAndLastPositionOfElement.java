package Binary_Search.problems;
import java.util.Arrays;
//  Problem:
//  Find First and Last Position
//
//  Pattern:
//  Binary Search
//
//  Key idea:
//  Use binary search twice — once to find the first
//  occurrence and once to find the last occurrence.
//
//  Time: O(log n)
//  Space: O(1)
public class firstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        if(nums.length == 0){
            return result;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else{
                result[0]= mid;
                end = mid -1;
            }
        }
        start = 0;
        end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else{
                result[1]= mid;
                start = mid+1;
            }
        }
        return result;
    }
}
