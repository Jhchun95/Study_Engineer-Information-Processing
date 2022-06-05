package mydolist;

public class Etc6 {

	public static void main(String[] args) {
		// 10을 8로 나눈 나머지 2가 출력된다.
		System.out.println(-10%8);
		// 위와 같은 결과를 얻는다.
		// 피연산자의 부호를 모두 무시하고, 나머지 연산을 한 결과에 왼쪽 피연산자의 부호를 붙이면 된다.
		System.out.println(10%-8);
		System.out.println(-10%-8);
		
		// =============== 비교 연산 ==================
		// == : 두 값이 같으면, true 아니면 false
		// 10은 int형, 10.0f는 float형이다.
		System.out.printf("10=10.0f \t %b%n", 10==10.0f);
		System.out.printf("'0'==0 \t %b%n", '0'==0);
		System.out.printf("'A'==65 \t %b%n", 'A'==65);
		
		// 문자열을 비교할 때는 ==가 아닌 equals를 이용하여 비교한다.
		
	}

}
