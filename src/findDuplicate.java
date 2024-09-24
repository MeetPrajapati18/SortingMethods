class findDuplicate {
    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 7, 8, 5, 3, 1};
        int ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    public static int findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if (nums[i] != i + 1){
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swapArray(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
/*
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
                return nums[index];
            }
        }
*/

        return -1;
    }

    static void swapArray(int[]arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] x = new boolean[nums.length+1];
        for(int i : nums){
            if(x[i]) return i;
            x[i] = true;
        }
        return 0;
    }
}
*/