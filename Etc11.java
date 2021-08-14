package mydolist;

import java.util.Scanner;

public class Etc11 {

	public static void main(String[] args) {
		// 키보드로 값을 임의로 입력하는 코드이다.
		// Scanner에 대한 import는 필수이다.
		Scanner scan = new Scanner(System.in);
		// a와 b를 정수형으로 받는다.
		int a = scan.nextInt();
		int b = scan.nextInt();
		// char형 변수 c는 G다.
		char c = 'G';
		
		// 조건문
		// && : and(그리고)
		// a는 10보다 크고 b는 10보다 작으면
		if(a>10 && b<10) {
			// || : or(또는)
			if(a-b < 5 || a>15)
				c='X';
		}
		// 위와 비슷
		else if(a>5 && b<5) {
			if(a-b < 3 || b > 0)
				c='Y';
		}
		// if와 else if 외 나머지 else
		else
			c = 'Z';
		// 결과 출력
		System.out.printf("%c", c);
		scan.close();
	}

}
