public class Search {
    public static int linearSearch(int[], int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
    }

    public static int binarySearch(int[], int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if (target == arr[mid]){
            return mid;
        }
        else if (target < arr[mid]){
            return binarySearch(arr, target, start, mid - 1)
        }
        else{
            return binarySearch(arr, target, mid + 1, end)
        }
}
