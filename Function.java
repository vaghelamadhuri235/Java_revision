import java.util.*;
public class function {
	//print a given name in a function
	public static void PrintMyName(String name) {
		System.out.print(name);
		return ;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		//call
		PrintMyName(name);
	}
}
