package mydolist;

public class Etc2 {

	public static void main(String[] args) {

		int i=11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			// 2_000_000이 어떻게 작동하는 지에 대해 궁금해서 작성한 for문
			for(int j=0;j<2_000_000;j++) {
				;
			}
		}
		System.out.println("GAME OVER");
		
	}

}
