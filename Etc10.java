package mydolist;

// 기억 상기하기
class Test{
	int sample(int x) {
		return x*x;
	}
}

class Test2 extends Test{
	int sample(int y) {
//		Test2 안에서만 실행되기 때문에 2를 넣었을 시 값은 6이 나온다.
//		return y*y + y; 

//		super를 통해 Test2가 아닌 Test에서 오버
		return super.sample(y);
	}
}

// 실제 문제
// public class Etc10 {
// 	public static void main(String[] args) {
// 		// 객체 선언
// 		// 앞은 Test 클래스 A 이고, 뒤는 Test2 클래스이다. 변수 잘 보기
// 		Test A = new Test2();
// 		// Sample(2)의 함수값과 실행값을 잘 보도록 한다.
// 		System.out.print(A.sample(2));
// 	}
// }

// class Parent {
// 	void show() {
//     	System.out.println("parent");
//     }
// }

// class Child extends Parent {
// 	void show() {
//     	System.out.println("child");
//     }
// }

// public class Test {
// 	public static void main(String[] args) {
//     	Parent pa = (①) Child();
//         pa.show();
//     }
// }
