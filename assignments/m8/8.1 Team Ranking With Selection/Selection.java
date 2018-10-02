class Selection {
    /**
     * { function_description }.
     *
     * @param      arr   The arr
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
        /**Time complexity of the above method is O(N^2log(N)).**/
    }
    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}