package mydolist;

// 복습
// 부모 클래스
class Parents {
	int compute(int num) {
		// 오버라이딩을 통해서 이것으로 작동
		// 오버라이딩의 개념 알기
		if(num<=1) return num;
		return compute(num-1) + compute(num-2);
	}
}

// 부모클래스에서 상속받는 자식 클래스
class Childs extends Parents{
	int compute(int num)  {
		// 재귀함수
		if(num<=1) return num;
		return compute(num-1) + compute(num-3);
	}
}

public class Exam6 {
	public static void main(String[] args) {
		// 객체 생성, main 메소드부터 실행
		Parents obj = new Childs();
		// 결과 출력
		System.out.print(obj.compute(4));
	}
}
