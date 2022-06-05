package mydolist;

import java.util.Arrays;

public class Etc4 {
	public static void main(String[] args) {
		
		// code의 배열을 선언.
		int[] code =  { -4, -1, 3, 6, 11};
		// arr의 배열을 선언
		int[] arr = new int[10];
		
		// arr 배열의 길이에 대해서
		for(int i=0; i< arr.length; i++) {
			// random함수, 즉 난수 랜덤발생기 함수 선언과 함께, 선언한 code의 길이와 더한다.
			// 난수 랜덤 발생기 random함수 활용, length : 길이
			int tmp = (int) (Math.random() + code.length);
			arr[i] = code[tmp];
		}
		// 출력, toString 활용
		System.out.println(Arrays.toString(arr));
	}
}
