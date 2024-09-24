import java.util.ArrayList;
import java.util.List;

class disappearNumber {
    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> answer = new ArrayList<>(findDisappearedNumbers(arr));
        System.out.println(answer);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>numberList = new ArrayList<>();

        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swapArray(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                numberList.add(index + 1);
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