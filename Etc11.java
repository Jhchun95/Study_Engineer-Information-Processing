package mydolist;

import java.util.Scanner;

public class Etc11 {

	public static void main(String[] args) {
		// 키보드로 값을 임의로 입력하는 코드들
		Scanner scan = new Scanner(System.in);
		// a와 b를 정수로 받는다.
		int a = scan.nextInt();
		int b = scan.nextInt();
		// char형 변수 c는 G다.
		char c = 'G';
		
		// 조건문
		// && : 
		if(a>10 && b<10) {
			// || : 또는
			if(a-b < 5 || a>15)
				c='X';
		}
		else if(a>5 && b<5) {
			if(a-b < 3 || b > 0)
				c='Y';
		}
		else
			c = 'Z';
		// 결과 
		System.out.printf("%c", c);
		scan.close();
	}

}
