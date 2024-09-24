import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        //best case = worst case = number of comparison = n*n
        int [] arr = {5,4,3,2,1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectSort(int[]arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, last);
            swapArray(arr, maxIndex, last);
        }
    }

    static void swapArray(int[]arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[]arr, int end){
        int max = 0;
        for (int i = 0; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
