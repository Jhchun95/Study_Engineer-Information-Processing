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

public class Etc10 {
	public static void main(String[] args) {
		Test A = new Test2();
		System.out.print(A.sample(2));
	}
}
