package FlowOfProgram;
import java.util.Arrays;
public class Remainder {
    public static void main(String[] args) {
//        System.out.println(1/10);
        int[] arr = {1,9,23,18,3};
//        int[] res = new int[arr.length];
        // reversing the array
//        int i = 0;
//        int j = arr.length-1;
//        while(j>=0){
//            res[i] = arr[j];
//            j--;
//            i++;
//        }
//        System.out.println(Arrays.toString(res));

        //swapping
        int j = arr.length-1;
        for(int i = 0;i<j;i++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                j--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
