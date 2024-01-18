package ex11;

import java.util.Arrays;

public class Ex03 {
	// 배열선언, 배열정렬, 배열 모든값 더하여 출력
	// 메서드사용

	Ex03() {
		int arr[] = new int[] { 10, 20, 5, 2, 11 };
		
		ArrayU myU = new ArrayU();
		myU.sort(arr); 
		myU.print(arr);

		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		new Ex03();
	}
}
