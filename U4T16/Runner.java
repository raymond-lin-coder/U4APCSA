import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] arrA = {8, 10, 7, 16, 3, 12, 5, 2, 13, 4, 15, 9, 6, 1, 14, 11};
        Sort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {8, 10, 7, 16, 3, 12, 5, 2, 13, 4, 15, 9, 6, 1, 14, 11};
        Sort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
}