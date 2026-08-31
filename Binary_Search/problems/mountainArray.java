package Binary_Search.problems;

public class mountainArray {
//    class Solution {
        // class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int start = 0;
//         int end = arr.length-1;
//         if(arr.length == 0){
//             return -1;
//         }
//         if(arr.length == 1){
//             return 0;
//         }
//         if(arr.length == 2){
//             if(arr[0]>arr[1]){
//                 return 0;
//             }
//             else{
//                 return 1;
//             }
//         }
//         while(start<=end){
//             int mid = start + (end-start)/2;
//             if(mid == arr.length-1){
//                 return mid;
//             }
//             int n = 0;
//             n = mid -1;
//             if(mid == 0){
//                 n = 0;
//             }
//             if(arr[mid]>arr[mid+1]&& arr[mid]>arr[n]){
//                 return mid;
//             }
//             else if(arr[mid]<arr[mid +1] && arr[mid]>=arr[n]){
//                 start = mid +1;
//             }
//             else{
//                 end = mid -1;
//             }
//             // if(arr[mid]>arr[mid+1]){
//             //     if(arr[mid-1]>arr[mid]){
//             //         end = mid;
//             //         // while(arr[end-1]>arr[end]){
//             //         //     end--;
//             //         // }
//             //         // return end;
//             //     }
//             //     else{
//             //         return mid;
//             //     }
//             // }
//             // else{
//             //     start = mid+1;
//             // }

        //         }
//         return -1;
//     }
// }
        class Solution {
            public int peakIndexInMountainArray(int[] arr) {
                int start = 0;
                int end = arr.length - 1;

                // start < end prevents mid from ever being the very last element
                while (start < end) {
                    int mid = start + (end - start) / 2;

                    // If the slope is going up, the peak is further right
                    if (arr[mid] < arr[mid + 1]) {
                        start = mid + 1;
                    }
                    // If the slope is going down, we are either AT the peak or passed it
                    else {
                        end = mid;
                    }
                }

                // When start and end converge, they are pointing directly at the peak
                return start;
            }
        }
//    }
}
