package mydolist;

public class Exam15 {

	public static void main(String[] args) {
		//week[] 배열 선언
		String week[] = {"일","월","화","수","목","금", "토"};
		// for ( : )문에 대해 익숙해지자
		// w는 week 일때, 즉 일~토까지 순서대
		for(String w : week)
			System.out.print( w + "요일  ");	
	}

}
