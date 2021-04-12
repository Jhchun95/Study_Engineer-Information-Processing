package mydolist;

public class Exam5 {
	public static void main(String args[]) {
		int result = factorial(4);
		System.out.println(result);
	}

	static int factorial(int n) {
//		int result = 0;
		if(n==1) 
			return 1;
		else
			return n * factorial(n-1);
//		return result;
	}
	
	// 반복문 대신 재귀호출을 사용하는 이유
	// 	반복문보다 재귀호출의 수행 시간이 더 오래 걸리고, 재귀호출이 주는 논리적 간결함도 있다.
	
	// 만약에 int의 n 값이 0일 경우에는 if문의 조건식이 절대 참이 될 수 없기 때문에 메소드가 종료되지 않고, 스택에 데이터가 쌓여만 간다.
}
