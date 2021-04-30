package mydolist;

import java.util.Arrays;

public class Etc4 {
	public static void main(String[] args) {
		
		// 200
		int[] code =  { -4, -1, 3, 6, 11};
		int[] arr = new int[10];
		
		for(int i=0; i< arr.length; i++) {
			int tmp = (int) (Math.random() + code.length);
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
	}
}
