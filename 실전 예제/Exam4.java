package mydolist;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		int i;
		// 키보드 입력값을 받는 Scanner
		Scanner s = new Scanner(System.in);
		// 정수형 Int
		i = s.nextInt();
		// 함수
		recursive(i);
		// 프로그램을 종료한다.
		s.close();
	}
	
	// 재귀함수 클래스 복습.613
	// 실행되는 순서 기억하기.
	static int recursive(int n) {
		// 정수형 i
		int i;
		// 재귀함수 루프 돌 수 있게 해주는 if else문
		if(n<1)
			return 2;
		else {
			i = ( 2 * recursive(n-1)) + 1;
			System.out.println(i);
			// i로 return하고 다시 recursive(int n)로 반복 
			return i;
		}
	}
	
}
