import java.util.*; 
class factorialrecur {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input = sc.nextInt();
		System.out.println(fact(input));
	}
	static long fact(long input) {
		if (input == 1) {
			return 1;
		}
		return input*fact(input - 1);
	}	
}