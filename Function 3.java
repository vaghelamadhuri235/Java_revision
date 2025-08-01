import java.util.*;
public class Main {
	//make a function to multiply 2 numbers and return the product
	public static int calculateproduct(int a , int b) {
		int product = a*b;
		return product;
}
public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(calculateproduct(a,b));
    }
}
