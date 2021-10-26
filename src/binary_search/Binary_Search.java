package binary_search;

public class Binary_Search {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {10,9,8,7,6,5,4,3,2,1};
        int target = 11;
        System.out.println(binarySearch(array, target));
//        System.out.println(orderAgnosticBinarySearch(array2, target));
    }






    // Assume array in ascending order
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean asc = arr[start] < arr[end];

        while (start <= end ) {
           // finding the middle number
//           int mid = ( start + end ) / 2; // Might be possible that start + end may overflow the int range.
            int mid = start + ( end - start) / 2;

            if(arr[mid] == target) return mid;

            if(asc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }



    // Assume array in descending order
    // 10,9,8,7,6,5
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end ) {
            // finding the middle number
//           int mid = ( start + end ) / 2; // Might be possible that start + end may overflow the int range.
            int mid = start + ( end - start) / 2;

            if(arr[mid] == target){
                return mid;
            } else if(target > arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }
}
