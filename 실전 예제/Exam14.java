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
		// 상속됨으로 이것으로 출력
		System.out.println("a=" + a);
	}
}
// 자식 B
// 상속 확인
class B extends A {
	// class A로 이동
	public B(int a) {
		// super 확인
		super(a);
		super.display();
	}
}
// 메인클래스, 객체 생성해서 실행한 곳
public class Exam14 {
	public static void main(String[] args) {
		// 객체 생성
		// B 클래스의 10의 값을 넣어 실행한다.
		B obj = new B(10);
	}

}

// class Connection {
//   private static Connection _inst = null;
//   private int count = 0;
//     static public Connection get() {
//       if(_inst == null) {
//       _inst = new Connection();
//       return _inst; 
//       }
//     return _inst;
//     }
//   public void count() { count ++; }
//   public int getCount() { return count; }
// }
 
// public class testcon {
//   public static void main(String[] args) {
//     Connection conn1 = Connection.get();
//     conn1.count();
//     Connection conn2 = Connection.get();
//     conn2.count();
//     Connection conn3 = Connection.get();
//     conn3.count();
    
//     System.out.print(conn1.getCount());
//   }
// }


