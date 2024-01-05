package ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = n % 2 == 0 ? n + " is even" : n + " is odd";
		System.out.println(result);
//		if(n%2==0) {
//			System.out.println(n + " is even");
//		} else {
//			System.out.println(n + " is odd");
//		}
	}
}
