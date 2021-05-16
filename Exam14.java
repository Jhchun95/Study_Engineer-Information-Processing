package mydolist;
// 상속에 대한 개념을 확인하는 프로젝트

// 부모 A
class A {
	int a;
	public A(int a) {
		this.a = a;
	}
	void display() {
		System.out.println("a=" + a);
	}
}
// 자식 B
class B extends A {
	public B(int a) {
		super(a);
		super.display();
	}
}
public class Exam14 {
	public static void main(String[] args) {
		B obj = new B(10);
	}

}
