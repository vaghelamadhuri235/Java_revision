import java.util.*;
public class function {
	public static void printfactorial(int n) {
		if (n < 0) {
			System.out.print("invalid number");
			return ;
		}
		int factorial = 1;
		for (int i = n; i >= 1; i++) {
			factorial = factorial = i;
		}
		System.out.println(factorial);
		return ;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printfactorial(n);
	}
}}
