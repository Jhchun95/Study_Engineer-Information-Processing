package mydolist;

public class Exam5 {
	public static void main(String args[]) {
		int result = factorial(4);
		System.out.println(result);
	}
	
	// 재귀함수 static 클래스
	static int factorial(int n) {
//		int result = 0;
		if(n==1) 
			return 1;
		else
			return n * factorial(n-1);
//		return result;
	}
	
	// 어떻게 메서드가 자기 자신을 호출할 수 있는지 의아되었다. 
	// -> 메서드 입장에서는 자기 자신을 호출하는 것과 다른 메서드를 호출하는 것은 차이가 없다.
	// -> 메서드 호출이라는 것이 그저 특정 위치에 저장되어 있는 명령들을 수행하는 것일 뿐이기 때문이다.
	// call by value
	
	// 반복문 대신 재귀호출을 사용하는 이유
	// ->반복문보다 재귀호출의 수행 시간이 더 오래 걸리고, 재귀호출이 주는 논리적 간결함도 있다.
	
	// 만약에 int의 n 값이 0일 경우에는 if문의 조건식이 절대 참이 될 수 없기 때문에 메소드가 종료되지 않고, 스택에 데이터가 쌓여만 간다.
	
}
