package mydolist;

public class Etc7 {

	// 405
	// 인스턴스멤버 간에는 서로 직접 접근이 가능하다.	
	// static 멤버 간에는 서로 직접 접근이 가능하다.
	class InstanceInner {
		int iv = 100;
//		static int cv = 100;
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
	//		static int cv = 300;
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
			System.out.println(InstanceInner.CONST);
			System.out.println(StaticInner.cv);
	}

}