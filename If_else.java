import java.util.*;
public class Main {
	public static void main(String[] args) {
		// if else condition
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		if (button == 1) {
			System.out.print("good morning");
		} else if (button == 2) {
			System.out.println("good afternoon");
		} else if (button == 3)  {
			System.out.print("good evening");
		} else {
			System.out.print("nothing");
		}
	}
}
