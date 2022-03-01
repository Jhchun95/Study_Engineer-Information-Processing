package mydolist;

// 상속 개념 복습
class ParentGame {
	
	static String name;
	static int rank;
	
	public static void Print() {
		System.out.println("내가 고른 게임의 이름은 " + name);
		System.out.println(rank);
	}
}

class ChildGame extends ParentGame {
	
	public ChildGame(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	public static void Print() {
		System.out.println("내가 안 고른 게임의 이름은 " + name);
		System.out.println(rank);
	}

}

public class Etc12 {

	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;	
//		int e = a + b + c + d ;
//		// 저장을 해야 출력이 올바르게 된다.
//		// 코딩 다 해놓고 저장하지 않으면 출력이 안돼는 것은 당연
//		System.out.println(e);
		
		ParentGame GL = new ChildGame("카트라이더", 1);
		System.out.println(GL);
		ParentGame.Print();
		ChildGame.Print();
		
		ChildGame GL2 = new ChildGame("카트라이더", 1);
		System.out.println(GL);
		ParentGame.Print();
		ChildGame.Print();
	}

}
