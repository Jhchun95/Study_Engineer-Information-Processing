package mydolist;

public class Exam7 {

	public static void main(String[] args) {
		
		// 배열에 대해 알아보기 위해 코딩 작성
		// [3][5] 2중배열로 선언
		int arry[][] = new int[3][5];
		// n은 1
		int n=1;
		// i는 0부터 시작해서 1씩 증가한다.
		for(int i=0; i<3; i++) {
			// j는 0부터 시작해서 1씩 증가한다.
			for(int j=0; j<5; j++) {
				// 선언된 배열의 위치에 따라 값을 기입하게끔 계산
				arry[i][j] = j * 3 + i + 1;
				// 각각의 배열 i와 j에 맞는 값 출력
				System.out.print(arry[i][j] + " ");
			}
			System.out.println();
		}

	}

}
