package mydolist;

// 추상 클래스와 상속을 이용한 코딩
// super의 개념과 extends의 개념 숙지해보기

abstract class Vehicle {
	String name;
	abstract public String getName(String val);
	public String getName() {
		return "Vehicle name : " + name;
	}
}

// 추상메소드 : 자식 클래스에서 재정의해야만 사용할 수 있는 메소드
//	ex) Car => 트럭, 승용차, 버스 등등
// 오버라이딩 : 조상 클래스부터 상속 받은 메소드의 내용을 변경하는 것
// 오버로딩 : 한 클래스 내에 같은 이름의 메소드를 여러 개 작성하는 것


class Car extends Vehicle {
	private String name;
	
	public Car(String val) {
		name = super.name = val;
	}
	public String getName(String val) {
		return "Car name : " + val;
	}
	public String getName(byte[] val) {
		return "Car name : " + val;
	}
}

public class Exam1 {
	public static void main(String[] args) {
		// 객체 선언
		Vehicle obj = new Car("Spark");
		System.out.print(obj.getName());
	}
	
}
