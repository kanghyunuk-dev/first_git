package ex09;

import java.util.Scanner;

public class Ex01_v {
	public static void main(String[] args) {
		/*
		 * 반복문
		 * for
		 * while
		 * do-whil
		 * 
		 * 반복문 중지
		 * break
		 * 특정조건제외
		 * continue
		 */
		
		// 화면입력 - scanner
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		// 구구단
		// for
		for(int i=1; i<10; i++) {
			System.out.println(input + "x" + i + "=" + input*i);
		}
		// while
		int i = 1;
		while(i<10) {
			i++;
			if(i == 9) {
				break;
			}
			System.out.println(input + "x" + i + "=" + input*i);
		}
	}
}
