class firstMissingPositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositiveNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swapArray(nums,i,correct);
            }
            else {
                i++;
            }
        }

/*
        int ans = 1;
        for (int index = 0; index < nums.length; index++){
            if (ans == nums[index]){
                ans++;
            }else {
                return ans;
            }
        }
        return ans;
*/

        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index+1){
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    static void swapArray(int[]arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}