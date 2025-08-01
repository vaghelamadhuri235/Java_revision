import java.util.*;
public class function {
	public static int calculatesum(int a, int b) {
		// make a function to add 2 numbers and return the sum
		int sum = a + b;
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//int sum = calculatesum(a,b);
		System.out.print(calculatesum(a, b));
	}
}
