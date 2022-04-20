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

// #include <stdio.h>
 
// int main(){
// int *arr[3];
// int a = 12, b = 24, c = 36;
// arr[0] = &a;
// arr[1] = &b;
// arr[2] = &c;
 
// printf("%d\n", *arr[1] + **arr + 1);
 
// }
 
