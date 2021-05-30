package mydolist;

public class Etc7 {

	// 405
	// 인스턴스멤버 간에는 서로 직접 접근이 가능하다.	
	// static 멤버 간에는 서로 직접 접근이 가능하다.
	class InstanceInner {
		int iv = 100;
		// 에러! static 변수를 선언할 수 없다.
//		static int cv = 100;
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		// static 클래스만 static 멤버를 정의할 수 있다.
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			// 에러! static 변수를 선언할 수 없다.
	//		static int cv = 300;
			// final static은 상수이므로 허용한다.
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
			System.out.println(InstanceInner.CONST);
			System.out.println(StaticInner.cv);
	}

}
