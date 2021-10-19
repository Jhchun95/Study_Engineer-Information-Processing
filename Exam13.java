package mydolist;

public class Exam13 {

	public static void main(String[] args) {

		int a=3, b=4, c=5, d=5;
		
		// a = a + 6 + (--b)의 식이다
		// --b : 4에서 1 감소했으므로 값의 결과가 3이 된다.
		// 최종 a의 계산값은 12가 나온다.
		a += 6 + --b;
		// d = d * (7 - (c++))의 식이다.
		// c++ : 5에서 1 증가했으므로 값의 결과는 6이 된다.
		// 최종 d의 계산값은 가로 안의 계산값을 순서대로 계산함에 따라 5*2, 즉 10이 된다.
		d *= 7 - c++;
		// a b c d 에 대한 값을 출력하기
		System.out.printf("%d, %d, %d, %d", a, b, c, d);
		
	}

}
