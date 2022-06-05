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

// 자바에서는 어떤 클래스의 기능을 확장하여 새로운 클래스를 만들기 위해 상속을 한다. 이때 사용하는 예약어는 [    ]이다.
// 답 : extends

// 하위 클래스가 상위 클래스의 생성자를 호출하거나 상위 클래스의 멤버 변수, 메서드를 호출하기 위해 사용하는 예약어로 상위 클래스의 주소, 즉 참조 값을 나타내는 예약어는 [     ]이다.
// 답 : super()

// 클래스를 상속받은 상태에서 상위 클래스에 이미 정의되어 있는 메서드를 하위 클래스에서 사용하기 위해 적절하지 않은 경우에 해당 메서드를 재정의할 수 있다. 이것을 [   ]라고 한다. 
// 답 : 메서드 오버라이드


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
