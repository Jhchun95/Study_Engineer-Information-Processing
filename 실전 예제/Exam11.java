package mydolist;

public class Exam11 {

	public static void main(String[] args) {
		// 배열 a 에 대한 선언
		int[] a = { 3, 4, 10, 5, 2 };
		// 2중 for문
		for(int i=0; i<=3; i++) {
			for(int j=i+1; j<4; j++) {
				// 만약에 a[i]가 a[j]보다 작으면
				if(a[i] < a[j]) {
					// 서로의 위치를 바꾸는 코드
					// 즉, 내림차순
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		// 실행 갯수만큼 출력하는 println 코드.
		for(int i=0; i<5; i++)
			System.out.println(a[i]);
		
	}

}
