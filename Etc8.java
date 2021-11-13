package mydolist;

public class Etc8 {
	public static void main(String[] args) {
		// 길이가 3인 Tv객체 배열
		Tv[] tvArr = new Tv[3];

		// Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
		for(int i=0; i< tvArr.length; i++) {
			tvArr[i] = new Tv();
			// tvArr[i]의 channel에 i+10을 저장
			tvArr[i].channel = i + 10;
		}
		
                // for문으로 반복
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
		}
		
	}

}
// Tv 클래스를 만들어서 선언
class Tv {
	// 변수 선언
	String color;
	boolean power;
	int channel;
	
	// 메소드 생성
	void power() {
		power =! power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
}
