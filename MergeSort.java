public class MergeSort {
    public static int[] sort(int[] array, int left, int right) {
        if (right == left) {
            return new int[]{array[left]};
        }

        int[] leftSorted = sort(array, left, (left + right) / 2);
        int[] rightSorted = sort(array, ((left + right) / 2 + 1), right);

        int[] merged = new int[right - left + 1];

        int nextLeftSortedIndex = 0;
        int nextRightSortedIndex = 0;
        for(int i = 0; i < merged.length; i++) {
            if (nextLeftSortedIndex == leftSorted.length) {
                merged[i] = rightSorted[nextRightSortedIndex];
                nextRightSortedIndex++;
            } else if (nextRightSortedIndex == rightSorted.length) {
                merged[i] = leftSorted[nextLeftSortedIndex];
                nextLeftSortedIndex++;
            } else if (leftSorted[nextLeftSortedIndex] < rightSorted[nextRightSortedIndex]) {
                merged[i] = leftSorted[nextLeftSortedIndex];
                nextLeftSortedIndex++;
            } else {
                merged[i] = rightSorted[nextRightSortedIndex];
                nextRightSortedIndex++;
            }
        }

        return merged;
    }
}
