package mydolist;

// 상속 개념 복습
// 상속 : 기존의 클래스에 기능을 추가하거나 재정의하여 새로운 클래스를 정의하는 것
class ParentGame {
	static String name;
	static int rank;
	
	// 부모클래스에서 호출되는 Print() 함수인지 확인할려고 자식클래스와 같이 씀.
	public static void Print() {
		System.out.println("내가 고른 게임의 이름은 " + name);
		System.out.println(rank);
	}
}

class ChildGame extends ParentGame {
	public ChildGame(String name, int rank) {
		// ParentGame 클래스에서 작성한 것으로 재사용.
		super();
		this.name = name;
		this.rank = rank;
	}
	
	// 자식클래스에서 호출되는 Print() 함수인지 확인할려고 부모클래스와 같이 씀.
	public static void Print() {
		System.out.println("내가 안 고른 게임의 이름은 " + name);
		System.out.println(rank);	
	}
}

public class Etc12 {
	public static void main(String[] args) {

		// 부모클래스를 이용하여 객체 선언한 코드
		ParentGame GL = new ChildGame("카트라이더", 1);
		GL.Print();
		
		// 자식클래스를 이용하여 객체 선언한 코드
		ChildGame GG = new ChildGame("메이플스토리", 2);
		GG.Print();
	
//				
//		ParentGame.Print();
//		ChildGame.Print();

// 출력 
// 내가 고른 게임의 이름은 카트라이더
// 1
// 내가 안 고른 게임의 이름은 메이플스토리
// 2		
		
	}

}

// 실제 기출
// public class ovr1 {

// 	public static void main(String[] args){
// 		ovr1 a1 = new ovr1();
// 		ovr2 a2 = new ovr2();
// 		System.out.println(a1.sun(3,2) + a2.sun(3,2));
// 	}	
// 	int sun(int x, int y) {
// 		return x+y;
// 	}
// }

// class ovr2 extends ovr1 {
// 	int sun(int x, int y) {
// 		return x-y + super.sun(x,y);	
// 	}	
// }
// 답 : 11






