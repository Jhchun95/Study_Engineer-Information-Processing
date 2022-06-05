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
		
		// 우선
		// 우선순위 1 : x++ , x-- , (), [], . , ->
		// 우선순위 2 : ++x , --x , +x, -x, !, ~ , *x
		// 우선순위 3 : * , /, %
		// 우선순위 4 : +, - 
		// 우선순위 5 : <<, >>
		// 우선순위 6 : <, <=, >, >=
		// 우선순위 7 : == , !=
		// 우선순위 8 : &
		// 우선순위 9 : ^
		// 우선순위 10 : |
		// 우선순위 11 : &&
		// 우선순위 12 : ||
		// 우선순위 13 : ? :
		// 우선순위 14 : =, +=, -= 등등
		// 우선순위 15 : ,
	}

}
