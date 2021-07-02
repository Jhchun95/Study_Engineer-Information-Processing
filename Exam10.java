package mydolist;

public class Exam10 {
	
	// arr()에 대한 클래스
	static int[] arr() {
		// a[] 배열의 크기는 4이다. ex) 0 , 1 , 2, 3
		int a[] = new int[4];
		// b는 a 배열의 길이
		int b = a.length;
		// 길이 b 보다 작은 경우까지 for문 동작
                // b = a.length 결국, 같은 의미이다
		for(int i=0; i< b; i++) 
			a[i] = i;
			return a;
	}
	
	public static void main(String[] args) {
		// a[]는 arr()이다.
		int a[] = arr();
		// for문을 이용하여 a[i]에 대한 값을 출력한다.
		for(int i=0; i<a.length; i++) {
			// 0 1 2 3 
			System.out.print(a[i] + " ");
		}
	}
	
}
