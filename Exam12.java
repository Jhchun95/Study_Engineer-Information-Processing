package mydolist;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// 프로그램을 실행할 때 키보드 입력을 도와주게 하는 Scanner
		Scanner input = new Scanner(System.in);
		// 프로그램 시작시 "정수 입력 : "이 나온다.
		System.out.print("정수 입력 : ");
		// a는 정수이며, 정수형 타입을 입력받는다.
		int a = input.nextInt();
		// a = a+1;
		a += 1;
		// a = a-1;
		a -= 2;
		// a = a*3;
		a *= 3;
		// a = a/4;
		a /= 4;
		// a = a%5;
		a %= 5;
		// a에 대한 결과값 
		System.out.println(a);
	}
	
}
