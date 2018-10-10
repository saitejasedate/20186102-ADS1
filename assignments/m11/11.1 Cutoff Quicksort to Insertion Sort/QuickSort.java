/**
 * Class for QuickSort.
 */
class QuickSort {
    /**.
     * Constructs QuickSort object.
     */
    QuickSort() {
    }
    /**.
     * { sorts all the elements using insertion array }.
     * Time complexity is O(N^2).
     * @param      arr  The arguments
     * @param      lo  The arguments
     * @param      hi  The arguments
     */
    public void insertion(final Comparable[] arr, final int lo,
     final int hi) {
        // int i = lo;
        // int j = hi;
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(arr[j], arr[j - 1]); j--) {
                exchange(arr, j, j - 1);
            }
        }
    }
    /**.
     * { swaps the elements in the array }
     * time complexity of this is constant.
     * @param      arr  The arguments
     * @param      j  The arguments
     * @param      min  The arguments
     */
    public void exchange(final Comparable[] arr, final int j, final int min) {
        Comparable swap = arr[j];
        arr[j] = arr[min];
        arr[min] = swap;
    }
    /**.
     * Returns a string representation of the object.
     * time complexity is O(N).
     * @param      arr   The arr
     *
     * @return     String representation of the object.
     */
    public String toString(final Comparable[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1] + "]";
        return str;
    }
    /**.
     * { sorts the elements in  the array }.
     * time complexity is O(log N)
     * @param      arr  The arguments
     * @param      lo  The arguments
     * @param      hi  The arguments
     * @param      cutOff  The arguments
     */
    public void sort(final Comparable[] arr, final int lo,
     final int hi, final int cutOff) {
        if (hi <= lo + cutOff - 1) {
            insertion(arr, lo, hi);
            System.out.println("insertionSort called");
            return;
        }
        int k = partition(arr, lo, hi);
        System.out.println(toString(arr));
        sort(arr, lo, k - 1, cutOff);
        sort(arr, k + 1, hi, cutOff);
    }
    /**.
     * { function_description }
     * time complexity is constant.
     * @param      array   The array
     * @param      cutOff  The cut off
     */
    public void sort(final Comparable[] array, final int cutOff) {
        sort(array, 0, array.length - 1, cutOff);
    }
    /**.
     * { divides the array into parts }.
     *  time complexity is O(N)
     * @param      arr   The arr
     * @param      lo   The lo
     * @param      hi  The hi
     *
     * @return  returns index of partition.
     */
    public int partition(final Comparable[] arr,
     final int lo, final int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (less(arr[++i], arr[lo])) {
                if (i == hi) {
                    break;
                }
            }
            while (less(arr[lo], arr[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exchange(arr, i, j);
        }
        exchange(arr, lo, j);
        return j;
    }
    /**.
     * { compares two objects }.
     *  time complexity is constant.
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }
}