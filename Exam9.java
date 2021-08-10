package mydolist;

public class Exam9 {

	public static void main(String[] args) {
		
		// 2차원 배열 a을 선언한다.
		// 초기화
		// 열의 길이는 명시하지 않았다. = 가변 배열
		int[][] a = { {11,12,13,14}, {21,22,23,24}, };
		
		// hap = 0으로 설정
		int hap = 0;
		//  i[]의 위치 값에 따라 a의 값은 달라진다.
		// for문 숙지
		for(int i[]: a) {
			// hap의 시작값은 0이고, j는 곧 i의 값이다.
			// for문 입력할 때, : 의 의미도 잘 알고 있어야한다.
			// j가 i일 때
			for(int j : i)
				// 계산
				hap = hap+j;
		}
		// print 결과값 140
		System.out.printf("%d", hap);
		
	}
}
