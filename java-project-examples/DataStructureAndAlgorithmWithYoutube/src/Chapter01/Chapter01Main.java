package Chapter01;

public class Chapter01Main {

    // @Link https://www.youtube.com/watch?v=hkwi2rQlPak

    public static void main(String[] args) {

        int[] numbers = {1, 3, 10, 11, 20, 35, 40};
        int target = 11;

        BinarySearch bs = new BinarySearch();

        int res = bs.binarySearch(numbers, target);

        System.out.println(res);

        System.out.println(target == numbers[res]);

    }
}
