package ex02;

import java.util.Scanner;

public class Ex08 {
	// num1 과 num2 매개변수로 받고 int형을 돌려주는 solution 함수
	public static int solution(int num1, int num2) {
		num1 = 10; // main 과는 다른영역 이므로 main 결과에 영향 주지않음
		return num1 + num2;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int num1 = scan.nextInt();
		
		System.out.println("숫자 입력");
		int num2 = scan.nextInt();
		
		int result = solution(num1, num2);
		
		// System.out.println("결과 = " + (num1 + num2));
		System.out.println("결과 = " + result);
		System.out.println("num1 = "+ num1);
		
		int result1 = solution(num1, num2);
		System.out.println("결과 = "+ result1);
	}
}
