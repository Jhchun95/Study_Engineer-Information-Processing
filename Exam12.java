package mydolist;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = input.nextInt();
		a += 1;
		a -= 2;
		a *= 3;
		a /= 4;
		a %= 5;
		System.out.println(a);
	}
	
}
