import java.util.Arrays;
//https://leetcode.com/problems/missing-number/description/
//Amazon Question

public class missingNumber {
    public static void main(String[] args) {
        int [] arr = {5,4,3,1,0};
        int answer = findMissingNumber(arr);
        System.out.println(answer);
    }

    static int findMissingNumber(int[]arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swapArray(arr,i,correct);
            }
            else {
                i++;
            }
        }

        //search for the first missing number.
        for (int index = 0; index < arr.length; index++){
            if (index != arr[index]){
                return index;
            }
        }

        //case 2 : last number is missing
        return arr.length;
    }

    static void swapArray(int[]arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
