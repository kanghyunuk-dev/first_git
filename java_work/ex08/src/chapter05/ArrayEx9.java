package chapter05;
import java.util.*;  // Arrays.toString()

class ArrayEx9 {
	public static void main(String[] args) {
		// 배열의 요소
		int[] code = { -4, -1, 3, 6, 11 };  
		int[] arr = new int[10];
		
		// i= 0 ~ 9 까지 동작
		for (int i=0; i < arr.length ; i++ ) {
			// 0 < x < 1
			// 0 < x < 5
			// 0.00001 < x < 4.99999
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}

		System.out.println(Arrays.toString(arr));
	} 
}
