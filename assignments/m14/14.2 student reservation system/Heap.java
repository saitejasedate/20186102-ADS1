/**
 * Class for heap.
 */
public class Heap {

    // This class should not be instantiated.
    private Heap() { }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * Time complexity is O(logN).
     * @param pq the array to be sorted
     */
    public static void sort(Comparable[] pq) {
        int n = pq.length;
        // System.out.println("HI");
        for (int k = n/2; k >= 1; k--)
            sink(pq, k, n);
        while (n > 1) {
            exch(pq, 1, n--);
            sink(pq, 1, n);
        }
    }

   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/
    /**
     * sink function.
     * Time complexity is logN.
     * @param      pq    { parameter_description }
     * @param      k     { parameter_description }
     * @param      n     { parameter_description }
     */
    private static void sink(Comparable[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }

   /***************************************************************************
    * Helper functions for comparisons and swaps.
    * Indices are "off-by-one" to support 1-based indexing.
    ***************************************************************************/
   /**
    * return true if the condition satisfies.
    * Time complexity is constant.
    * @param      pq    { parameter_description }
    * @param      i     { parameter_description }
    * @param      j     { parameter_description }
    *
    * @return     { description_of_the_return_value }
    */
    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i-1].compareTo(pq[j-1]) > 0;
    }
    /**
     * swap of elements.
     * Time complexity is constant.
     * @param      pq    { parameter_description }
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = swap;
    }

    // print array to standard output
    
    /**
     * show function.
     * Time complexity is N.
     * @param      a     { parameter_description }
     */
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println((a[i]));
        }
    }
}
