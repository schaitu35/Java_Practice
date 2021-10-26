package linear_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchIn2dArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,10,8,9,77},
                {22, 10000, 55, 78},
                {79, 89, 85, 7, -1}
        };

        System.out.println(findRichest(arr));
    }

    private static int findRichest(int[][] arr) {
        int rich = Integer.MIN_VALUE;

        for(int[] a: arr){
            int sum = 0;
            for(int b: a){
                sum = sum + b;
            }
            if(sum > rich) rich = sum;
        }

        return rich;
    }

    private static void findEvenDigits(int[][] arr) {
        for(int[] row: arr){
            for(int element : row) {
                String number = String.valueOf(element);
                int numLength = number.length();
                if(numLength%2 !=0 ) System.out.print( number + " ,");
            }
        }
    }

    private static void findTarget(int[][] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr[i].length; j++) {
                if(target == arr[i][j]) System.out.println("Target Present at :: " + Arrays.toString(new int[]{i, j}));
            }
        }
    }

    // 2D arrays are actually Arrays of Arrays
    private static void findMin(int[][] arr){
        int min = Integer.MAX_VALUE;

        for (int[] ints : arr) {
            // ints are arrays
            for (int anInt : ints) {
                if (anInt < min) min = anInt;
            }
        }
        System.out.println(min);

    }


}
