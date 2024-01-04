package ex03;

import java.util.Scanner;

/*
 * 실수는 소수 두번째
 * 숫자를 입력받아 소수 둘째자리까지만 
 */

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력");
		double d = scan.nextDouble();
		System.out.println(d);
		double trans_d = (int)(d*100)/100.0;
		System.out.println("trans_d =" + trans_d);
	}
}
