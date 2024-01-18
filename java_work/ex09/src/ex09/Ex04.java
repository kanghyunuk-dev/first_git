package ex09;

import java.util.Arrays;

/*	
 * { 100,90,60,40,120}
 * 버블정렬
 * 1회전
 * { 100,90,60,40,120}
 * { 90,100,60,40,120}
 * { 90,60,100,40,120}
 * { 90,60,40,100,120}
 * 2회전
 * { 60,90,40,100,120}
 * { 60,40,90,100,120}
 * 3회전
 * { 40,60,90,100,120}
 * 
 * 1. 요소 중 제일 큰수
 * 2. 요소 중 제일 작은수
 * 
 * 3. 오름차순
 * 4. 내림차순
 */
public class Ex04 {
	public static void main(String[] args) {
		/* 내림차순
		 * 120 100 90 60 40
		 * 오름차순
		 * 40 60 90 100 120
		 */
		int [] arr = { 100,90,60,40,120};
		
		for(int i=0; i<5-i; i++) {
			for(int j=0; j<5-j; j++) {
				if(arr[j]>arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}
