class Insertion {
	/**
	 * { function_description }.
	 *
	 * @param      a     { parameter_description }
	 */
	public static void sort(Comparable[] a) {
		int arr_length = a.length;
		for (int i = 0; i < arr_length; i++) {
			for (int j = i; j > 0; j--) {
				if (less(a[j - 1], a[j])) {
					exch(a, j, j - 1);
				}
				else {
					break;
				}
			}
		}
	}
	/**Time complexity of the above method is O(N^2log(N))**/
	/**
	 * { function_description }.
	 *
	 * @param      v     { parameter_description }
	 * @param      w     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */

	private static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}
	/**
	 * { function_description }.
	 *
	 * @param      a     { parameter_description }
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
