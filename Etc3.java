package mydolist;

public class Etc3 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i< src.length(); i++) {
			// char형 숙지하기
			// src의 i번째 문자를 ch에 저장
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+":" + ch);
			
			// String을 char[]로 변환
			char[] chArr = src.toCharArray();
			
			// char배열(char[])을 출력
			System.out.println(chArr);
			
		}
	}
}
