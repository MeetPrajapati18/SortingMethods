import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

class setMismatch {
    public static void main(String[] args) {
        int[]nums = {1,2,3,3,5,6,7};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swapArray(nums,i,correct);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swapArray(int[]arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}