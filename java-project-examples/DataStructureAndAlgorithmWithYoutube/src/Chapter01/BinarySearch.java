package Chapter01;

public class BinarySearch {

    public int binarySearch(int array[], int target) {

        int left = 0;
        int right = array.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(array[mid] == target) {
                return mid;
            }else if (target < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
