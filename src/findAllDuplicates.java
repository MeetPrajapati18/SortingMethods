import java.util.ArrayList;
import java.util.List;

class findAllDuplicates {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
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

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                numberList.add(nums[index]);
            }
        }
        return numberList;

    }

    static void swapArray(int[]arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}