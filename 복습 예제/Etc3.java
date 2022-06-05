package mydolist;

public class Etc3 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i< src.length(); i++) {
			// char형 숙지하기
			// char는 character의 약자로 문자 1개를 저장하는 자료형이다.
			// char형 변수는 작은 따옴표 안에 있는 값이다.
			// String형과 비슷한데 String 클래스가 내부적으로 char[]형을 업그레이드해서 만들어졌다고 한다. + 자바에서 제공해주는 클래스
			// https://imasoftwareengineer.tistory.com/46 괜찮으니 읽어보면서 정리하기
			// src의 i번째 문자를 ch에 저장
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+":" + ch);
			
			// String을 char[]로 변환
			char[] chArr = src.toCharArray();
			
			// char배열(char[])을 출력
			System.out.println(chArr);
			
			// 번외로 for(자료형 변수명 : 배열명){ } 된 형식도 존재한다. 
			//
			
		}
	}
}
