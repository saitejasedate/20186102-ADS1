import java.util.*;
public class Solution{
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
 		int arr[] = new int[n];
 		for (int i = 0; i<n; i++){
 			arr[i]= sc.nextInt();
 		}
 		int count = 0;
 		int check = 1;
 		Arrays.sort(arr);
 		for (int i = 0; i< arr.length-1; i++) {
 			if (arr[i] == arr[i+1]) {
 				check +=1;
 			}else{
 				count += (check*(check-1))/2;
 				System.out.println(arr[i] + " :: " + count);
 				check = 1;
 			}
	   }
	   count += (check*(check-1))/2;
	   System.out.println(count);
	}
}   


