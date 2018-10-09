import java.util.Scanner;
/**
 * Class for minimum heap.
 *
 * @param      <E>   It implies the Generic type.
 */
public class MinHeap <E extends Comparable <E>> {

	private E[] array;
	private int size;

	MinHeap(E[] array) {
		this.array = array;
	}
/**
 * Determines if minimum heap.
 * 
 * By the analysis the complexity of the method is O(N).
 *
 * @return     True if minimum heap, False otherwise.
 */
	public boolean IsMinHeap() {
		for (int i = 1; i < array.length/2; i++) {
			if (min(2 * i, i) && min(2 * i + 1, i)) {
				return false;
			}
		}
		return true;
	}
/**
 * It compare the two elements and returns the boolean value.
 *
 * @param      i     it is an integer.
 * @param      j     it is an integer.
 *
 * @return    it return he boolean value.
 * 
 * By the analysis the complexity of the method is O(N).
 */
	public boolean min(final int i, final int j) {
		return array[i].compareTo(array[j]) < 0;
	}
}
	


	
