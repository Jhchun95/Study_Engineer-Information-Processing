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
		Vehicle obj = new Car("Spark");
		System.out.print(obj.getName());
	}
	
}
