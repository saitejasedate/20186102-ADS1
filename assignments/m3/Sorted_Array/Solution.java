import java.util.Scanner;
/**
 * { item_description }.
 */
public final class Solution {
    /**
     * { function_description }.
     *
     * @param      arr1  The arr 1
     * @param      arr2  The arr 2
     */
    public void mergeArrays(final int[] arr1, final int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] sortedarr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sortedarr[k++] = arr1[i];
                i++;
            } else {
                sortedarr[k++] = arr2[j];
                j++;
            }
        }
            if (i == arr1.length) {
                while (j < arr2.length) {
                    sortedarr[k++] = arr2[j];
                    j++;
                }
            } else {
                while (i < arr1.length) {
                sortedarr[k++] = arr1[i];
                i++;
            }
        }
        int x;
        for (x = 0; x < sortedarr.length - 1; x++) {
            System.out.print(sortedarr[x] + ",");
        }
        System.out.println(sortedarr[x]);
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfarr1 = Integer.parseInt(sc.nextLine());
        int sizeOfarr2 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[sizeOfarr1];
        int[] arr2 = new int[sizeOfarr2];
        String[] elements;
        if (sizeOfarr1 != 0) {
         elements = sc.nextLine().split(",");
        for (int i = 0; i < elements.length; i++) {
            arr1[i] = Integer.parseInt(elements[i]);
        }
    } else {
        sc.nextLine();
    }
        if (sizeOfarr2 != 0) {
        elements = sc.nextLine().split(",");
        for (int i = 0; i < elements.length; i++) {
            arr2[i] = Integer.parseInt(elements[i]);
        }
    }
        new Solution().mergeArrays(arr1, arr2);
    }
}
