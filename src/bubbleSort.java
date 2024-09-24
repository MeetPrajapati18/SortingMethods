import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        //with the first pass through the array the largest element came at the last
        //sinking sort, exchange sort
        //when j never swaps , it means array is sorted. best case
        //descending order array :- worst case
        int[]arr = {0,1,2,3,4,5,6,7,8,9,10};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[]arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++){
                //swap if the item is smaller than the previous item.
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
