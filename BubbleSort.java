public class BubbleSort {
    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            boolean swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimises the algorithm in case the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
