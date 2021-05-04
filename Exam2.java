package mydolist;

// 상속과 관련된 코드
// 부모 클래스
class Parent {
	int compute(int num) {
		if(num<=1) return num;
		return compute(num-1) + compute(num-2);
	}
}

// 자식 클래스, Parent에게 상속받았다.
class Child extends Parent {
	int compute(int num) {
		// 짧은 줄의 코드임에도 불구하고, 여러 번의 계산을 실행한다.
		// 스택 개념과 같이 push push, pop pop하는 구조.
		// compute(num)에 대한 해당 값을 구한다.
		if(num<=1) return num;
		return compute(num-1) + compute(num-3);
	}
}

// 전반적인 재귀함수 문제
public class Exam2 {
	public static void main(String[] args) {
		// 객체를 생성한다.
		Parent obj = new Child();
		// obj.compute(4)에 대한 것을 출력한다.
		System.out.println(obj.compute(4));
	}
}
