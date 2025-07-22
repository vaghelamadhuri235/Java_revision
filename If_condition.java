import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 18) {
			System.out.println("elder");
		}	else  {
			System.out.println("not elder");
		}
	}
}
