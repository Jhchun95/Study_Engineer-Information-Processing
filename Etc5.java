package mydolist;

public class Etc5 {

	public static void main(String[] args) {
		// 103
		// c1에는 문자 'a'의 코드값인 97이 저장된다.
		// c1에 저장되어 있는 값이 c2에 저장된다.
		// c3를 공백으로 초기화한다.
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		
		// 덧셈연산 c1 + 1 의 결과가 int이므로 이 결과를 char형 변수 c3에 담기 위해서는
		// char형으로의 형 변환이 필요하다.
		int i = c1 + 1;
		
		c3 = (char)(c1 + 1);
		c2++;
		c3++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
	}

}
