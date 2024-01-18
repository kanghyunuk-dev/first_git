package ex09;

import java.util.Arrays;

public class Ex05 {
	// 선입선출 LIFO(last in first out) -> Stack
	// 선입선출 FIFO -> Queue
	
	// stack
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i < arr.length; i++) {
			// Math.random -> 0.0 ~ 1.0 미만 값 반환
			// 0.0 < x < 1.0
			// 0 < x < 10
			// 0.000001 < x < 9.99999
			// double -> 소수점 까지반환
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
