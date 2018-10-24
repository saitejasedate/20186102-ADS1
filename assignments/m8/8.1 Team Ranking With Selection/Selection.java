/**
 * @author:saitejasedate.
 */
/**
 * Class for selection.
 */
class Selection {
    /**
     * { sort method for Insertion sort. It sorts all the elements in ascending order }
     * Complexity : N^2.The complexity for less method is 1
     * and exch method is 1 and inner loop iterates for N times and
     * outer loop iterates for another N times so overall time complexity is N**2.
     * @param      a     { comparable array }
     */
    public static void sort(Comparable[] arr) {
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; i++) {
            int min = i;
            for (int j = i + 1; j < arr_length; j++) {
                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }
            exch (arr, i, min);
        }
    }
    /**
     * compares v and w.
     *
     * @param      v     { index element of a }
     * @param      w     { index element of a }
     *complexity is 1 because the only one statement is executed.
     * @return     { returns true if condition statisfies}
     */
    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }
    /**
     * { exchanges the elements in ith index with jth index}
     *The time complexity is 1. Because the statements in this method are executed only once.
     * @param      a     { comparable array }
     * @param      i     { index of a }
     * @param      j     { index of a }
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
