package mydolist;
// 상속에 대한 개념을 확인하는 프로젝트

// 부모 A
class A {
	int a;
	// public A
	public A(int a) {
		this.a = a;
	}
	// display()
	void display() {
		// 출력
		System.out.println("a=" + a);
	}
}
// 자식 B
// 상속
class B extends A {
	// class A로 이동
	public B(int a) {
		super(a);
		super.display();
	}
}
//sefsefsdfsdfsef
public class Exam14 {
	public static void main(String[] args) {
		// 객체 생성
		B obj = new B(10);
	}

}
