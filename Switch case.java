import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		switch (button) {
		case 1:
			System.out.println("good morning");
			break ;
		case 2:
			System.out.println("good afternoon");
			break ;
		case 3:
			System.out.println("good evening");
			break ;
		default :
			System.out.println("nothing");

		}
	}
}
