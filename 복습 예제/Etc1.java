package mydolist;

public class Etc1 {

	public static void main(String[] args) {

		// a의 값을 설정한다.
		int a = 1000000;
		
		// * / 순서에 맞게 계산한다.
		int result1 = a * a / a ;
		int result2 = a / a * a ;
		
		// 각각의 결과값에 따라 값을 출력한다.
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		
		// result2는 a / a * a 로 했어야했는데 이부분은 잘못된 코드임으로 고쳐야한다.
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result2);
		
	}

}

// 주석 처리된 문법은 C언어 문법임
// 위의 JAVA 코드와 비슷한 문제라 문법 차이 비교를 위해 주석처리

// #include <stdio.h>
// int main(){

// int형 타입의 인덱스를 3개 가지고 있는 배열
// *arr[3]이라는 포인터 배열 선언
// int *arr[3];

// 각각의 a, b, c 변수를 선언
// int a = 12, b = 24, c = 36;

// 여기까지 &a = 12, &b = 24, &c = 36 이다.
// arr[0] = &a;
// arr[1] = &b;
// arr[2] = &c;
 
// printf문으로 계산 결과값을 출력
// *arr[1] : &b의 값을 가리키므로 24
// **arr : 이중포인터
// arr이 가리키는 위치의 내용 → 다음 *arr이 가리키는 위치의 내용이라고 해석한다.
// printf("%d\n", *arr[1] + **arr + 1);
 
// }
 
