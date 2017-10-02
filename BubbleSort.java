package ma.sorting;

public class BubbleSort {

    public static void sort(int[] arrayToSort) {
        int n = arrayToSort.length;
        int counter = 0;
        boolean swapped = true;
        while (counter < n - 1 && swapped) {
            for (int j = 0; j < n - 1 - counter; j++) {
                swapped = false;
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    swap(arrayToSort, j, j + 1);
                    swapped = true;
                }
            }
            counter++;
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
