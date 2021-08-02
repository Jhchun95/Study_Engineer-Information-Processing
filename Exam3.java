package mydolist;

// 0803 study
public class Exam3 {
	public static void main(String[] args) {
		// 8개의 메모리 공간을 배열로 선언한다.
		int[] a = new int[8];
		// i=0으로 설정한다.
		int i=0;
		// n=10으로 설정한다.
		int n=10;
		
		while(n>0) {
			// 어렴풋이 생각하면 이것은 2진수로 만드는 공식이다.
			// i의 값은 계속 증가하면서 n값의 나머지
			// n = n/2 이다.
			a[i++] = n%2;
			n /= 2;
		}
		
		// 배열에 해당된 i의 값들을 출력한다.
		for(i=7; i>=0; i--) {
			System.out.println(a[i]);
		}
	}
}
