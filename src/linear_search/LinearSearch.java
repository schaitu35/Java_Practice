package linear_search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {22, 11, 35, 77, 19, 22, 33, 79};
        int target = 79;
        System.out.println(linerSearch(arr,target));
        System.out.println(linearSearch2(arr,target));
        System.out.println("-----------------------------------------");
        System.out.println(linearSearchForRange(arr,target, 1, 9));
        System.out.println(linearSearchForRange(arr,target, 7, 10));
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));

    }

    private static boolean linearSearchForRange(int[] arr, int target, int start, int end) {

        if(start > arr.length || end > arr.length || start < 0 || end < 0) {
            return false;
        }
        for (int i = start -1 ; i < end; i++) {
            if(target == arr[i]){
                return true;
            }
        }

        return false;
    }

    private static int linerSearch(int[] arr, int target) {
        System.out.println(Arrays.toString(arr));

        // Check if Array length is 0
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }

    private static boolean linearSearch2(int[] arr, int target){
        for (int ele: arr) {
            if(ele == target){
                return true;
            }
        }
        return false;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) min = j;
        }
        return min;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) max = j;
        }

        return max;
    }

}
