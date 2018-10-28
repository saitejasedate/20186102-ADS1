/******************************************************************************
 *  Compilation:  javac Taxicab.java
 *  Execution:    java Taxicab n
 *  Dependencies: StdOut.java MinPQ.java
 * 
 *  Find all nontrivial integer solutions to a^3 + b^3 = c^3 + d^3 where
 *  a, b, c, and d are between 0 and n. By nontrivial, we mean
 *  a <= b, c <= d, and a < c.
 *
 *  % java Taxicab 11
 *
 *  % java Taxicab 12
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *
 *  % java Taxicab 1000
 *  1729 = 1^3 + 12^3 = 9^3 + 10^3
 *  4104 = 2^3 + 16^3 = 9^3 + 15^3
 *  13832 = 2^3 + 24^3 = 18^3 + 20^3
 *  20683 = 10^3 + 27^3 = 19^3 + 24^3
 *  32832 = 4^3 + 32^3 = 18^3 + 30^3
 *  ...
 *  87539319 = 167^3 + 436^3 = 228^3 + 423^3 = 255^3 + 414^3
 *  ...
 *  1477354411 = 802^3 + 987^3 = 883^3 + 924^3
 *
 ******************************************************************************/
/**
 * Class for taxicab.
 */
public class Taxicab implements Comparable<Taxicab> {
    /**
     * integer i.
     */
    private final int i;
    /**
     * integer j.
     */
    private final int j;
    /**
     * sum of long type.
     */
    private final long sum;
    /**
     * Constructs the object.
     *
     * @param      i1    I 1
     * @param      j1    The j 1
     */
    public Taxicab(int i1, int j1) {
        this.sum = (long) i1 * i1 *i1 + (long) j1 * j1 * j1;
        this.i = i1;
        this.j = j1;
    }
    /**
     * compare by i^3 + j^3, breaking ties by i
     * time complexity is 1.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(Taxicab that) {
        if (this.sum < that.sum) {
            return -1;
        }
        else if (this.sum > that.sum) { 
            return +1;
        }
        else if (this.i < that.i) {     
            return -1;
        }
        else if (this.i > that.i) {     
            return +1;
        }
        else {                          
            return  0;
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return i + "^3 + " + j + "^3";
    }
    /**
     * { function_description }
     *
     * @param      N     { parameter_description }
     * @param      M     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static long findTaxicab(int N, int M) {
        MinPQ<Taxicab> minPQ = new MinPQ<Taxicab>();
        int n = 600;
        int count = 0;
        long res = 0;
        for (int i = 1; i <= n; i++) {
            minPQ.insert(new Taxicab(i, i));
        }

        Taxicab prev = new Taxicab(0, 0);

        int run = 1;
        while (!minPQ.isEmpty()) {
            Taxicab curr = minPQ.delMin();
            if (prev.sum == curr.sum) {
                run = run + 1;
                if (run == M) {
                    count++;
                    if (count == N) {
                        res = curr.sum;
                        break;
                    }
                }
            } else {
                run = 1;
            }
            if (curr.j < n) {
                minPQ.insert(new Taxicab(curr.i, curr.j + 1));
            }
            prev = curr;
        }
        return res;
    }
}
