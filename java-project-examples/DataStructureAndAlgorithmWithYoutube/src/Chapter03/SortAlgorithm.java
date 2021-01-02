package Chapter03;

public class SortAlgorithm {

    public void insertionSort(int[] numbers) {

        int numberLength = numbers.length;

        for (int i = 1; i < numberLength; i++) {
            int current = numbers[i];
            int insertionIndex = i - 1;
            while (insertionIndex >= 0 && numbers[insertionIndex] > current) {
                numbers[insertionIndex + 1] = numbers[insertionIndex];
                insertionIndex--;
            }

            numbers[insertionIndex + 1] = current;

        }
    }

    // Divide and Conquer; 分治算法;
    public void quickSort(int[] numbers, int left, int right) {
        if (left >= right) return;

        int partitionIndex = partition(numbers, left, right);
        ;
        quickSort(numbers, left, partitionIndex - 1);
        quickSort(numbers, partitionIndex + 1, right);

    }

    public int partition(int[] numbers, int left, int right) {
        int pivot = numbers[right];

        int leftIndex = left;
        int rightIndex = right - 1;

        while (true) {
            while (leftIndex < right && numbers[leftIndex] < pivot) {
                leftIndex++;
            }

            while (rightIndex >= left && numbers[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex > rightIndex) break;
        }
        swap(numbers, leftIndex, right);

        return leftIndex;
    }

    public void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[left] = array[right];
        array[right] = tmp;
    }


    public int[] mergeSort(int[] numbers) {
        int[] helper = numbers.clone();
        mergeSort(numbers, helper, 0, numbers.length - 1);
        ;
        return numbers;
    }

    public void mergeSort(int[] numbers, int[] helper, int left, int right) {
        if (right - left < 1) return;

        int mid = left + (right - left) / 2;

        mergeSort(numbers, helper, left, mid);
        mergeSort(numbers, helper, mid + 1, right);
        merge(numbers, helper, left, mid, right);

    }

    public void merge(int[] numbers, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = numbers[i];
        }

        int leftIndex = left;
        int rightIndex = mid + 1;

        for (int i = left; i <= right; i++) {

            if (leftIndex > mid) {
                numbers[i] = helper[rightIndex++];
            } else if (rightIndex > right) {
                numbers[i] = helper[leftIndex++];
            } else if (helper[leftIndex] < helper[rightIndex]) {
                numbers[i] = helper[leftIndex++];
            } else {
                numbers[i] = helper[rightIndex++];
            }
        }
    }
}
