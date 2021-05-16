package mydolist;

public class Etc2 {

	public static void main(String[] args) {

		int i=11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			// 2_000_000이 어떻게 작동하는 지에 대해 궁금해서 작성한 for문이다.
			// 이클립스 프로그래밍에서 컴파일 실행해본 결과 _도 숫자로 인식한다.
			// 즉 200만
			
			// for문 안에 딱히 프로그래밍된 코드가 없기 때문에 바로 GAME OVER 문구가 나온다.
			// 하지만 for문은 System.out.println만 적을 시 무한루프로 실행되어 for문에서 빠져나오지 못한다.
			for(int j=0;j<2_000_000;j++) {
				//System.out.println(j)
				;
			}
		}
		// for문이 비어있기 때문에 올바르게 출력된다.
		System.out.println("GAME OVER");
		
	}

}
