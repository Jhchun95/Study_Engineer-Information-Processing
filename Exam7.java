package mydolist;

public class Exam7 {

	public static void main(String[] args) {

		int arry[][] = new int[3][5];
		int n=1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				arry[i][j] = j * 3 + i + 1;
				System.out.print(arry[i][j] + " ");
			}
			System.out.println();
		}

	}

}
