package mydolist;

public class Exam11 {

	public static void main(String[] args) {
		int[] a = { 3, 4, 10, 5, 2 };
		for(int i=0; i<=3; i++) {
			for(int j=i+1; j<4; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<5; i++)
			System.out.println(a[i]);
		
	}

}
