import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfvalues = sc.nextInt();
		MinPQ<Float> minpq = new MinPQ<Float>(numOfvalues);
		MaxPQ<Float> maxpq = new MaxPQ<Float>(numOfvalues);
		int[] arr = new int[numOfvalues];
		float median = 0.0f; 
		while (sc.hasNext()) {
			for (int i = 0; i < numOfvalues; i++) {
				float value = sc.nextFloat();
				if(value > median) {
					minpq.insert(value);
				} else {
					maxpq.insert(value);
				}
				if (maxpq.size() - minpq.size() > 1) {
					float value1 = maxpq.delMax();
					minpq.insert(value1);
				} else {
					float value1 = minpq.delMin();
					maxpq.insert(value1);
				}
				if (maxpq.size() == minpq.size()) {
					median = (minpq.min() + maxpq.max()) / 2;
					System.out.println(median);
				}  
				else if (maxpq.size() > minpq.size()) {
					median = maxpq.max();
					System.out.println(median);
				} 
				else {
					median = minpq.min();
					System.out.println(median);
				}
			}
		}	
	}
}