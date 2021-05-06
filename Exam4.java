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
	
	static int recursive(int n) {
		// 정수형 i
		int i;
		// 재귀함수 호출하게 도와주는 
		if(n<1)
			return 2;
		else {
			i = ( 2 * recursive(n-1)) + 1;
			System.out.println(i);
			return i;
		}
	}
	
}
