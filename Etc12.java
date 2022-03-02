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
		super();
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

		// 부모클래스
		ParentGame GL = new ChildGame("카트라이더", 1);
		GL.Print();
		
		// 자식클래스
		ChildGame GG = new ChildGame("메이플스토리", 2);
		GG.Print();
	
//		ParentGame.Print();
//		ChildGame.Print();
	}

}
