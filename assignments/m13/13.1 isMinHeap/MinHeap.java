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
 * By the analysis the complexity of the method is O(N^2).
 *
 * @return     True if minimum heap, False otherwise.
 */
	public boolean IsMinHeap() {
		for (int i = 0; i < array.length; i++) {
			if (2 * i < array.length && min(2 * i, i)) {
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
	


	
