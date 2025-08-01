hereimport java.util.*;
public class Main {
	public static void main(String[] args) {
		int n = 5;
		int pos = 1;
		int bitmask = 1 << pos;
		int newnumber = bitmask | n;
		System.out.print(newnumber);
	}
}
