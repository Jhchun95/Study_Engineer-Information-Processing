package mydolist;

public class Exam8 {

	public static void main(String[] args) {
		// String 문자열 Programming 에 대하여 선언한다.
		String str = "Programming";
		// n = str 문자열의 길이를 뜻한다.(=str.length() )
		// 총 11
		int n = str.length();
		
		// char형 배열로 선언한다.
		char[] st = new char[n];
		
		n--;
		// for문과 charAt를 이용하여 char의 특정 위치를 반환한다.
		for(int k=n; k>=0; k--) {
			st[n-k] = str.charAt(k);
		}

		// 위 for문의 출력되는 값에 따라 최종적으로 Programming 역순으로 출력한다.
		// for each문 , 보통 배열 변수명으로 입력하여 인덱스 첫번째 자리부터 차례대로 값이 자동적으로 기입된다.
		// 'k의 값이 st일 때'라는 의미 
		for(char k : st) {
			System.out.printf("%c", k);
		}
	
	}

}
