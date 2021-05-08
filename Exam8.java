package mydolist;

public class Exam8 {

	public static void main(String[] args) {
		// String 문자열 Programming 에 대하여 선언한다.
		String str = "Programming";
		// n = str 문자열의 길이를 뜻한다.
		int n = str.length();
		
		// char형 배열로 선언한다.
		char[] st = new char[n];
		
		n--;
		// for문과 charAt를 이용하여 char의 특정 위치를 반환한다.
		for(int k=n; k>=0; k--) {
			st[n-k] = str.charAt(k);
		}

		// 최종적으로 Programming 역순으로 출력한다.
		for(char k : st) {
			System.out.printf("%c", k);
		}
	
	}

}
