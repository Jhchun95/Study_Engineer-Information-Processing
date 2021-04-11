package mydolist;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		recursive(i);
		s.close();
	}
	
	static int recursive(int n) {
		int i;
		if(n<1)
			return 2;
		else {
			i = ( 2 * recursive(n-1)) + 1;
			System.out.println(i);
			return i;
		}
	}
	
}
