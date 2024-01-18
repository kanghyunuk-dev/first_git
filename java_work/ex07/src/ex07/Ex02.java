package ex07;

import java.lang.String; // 생략되어짐

public class Ex02 {
	public static void doA() {
		System.out.println("doA 매개변수 없는 함수");
		return;
	}
	public static void doB(int a) {
		System.out.println("doA 매개변수 a = " + a);
		if(a == 10) {
			return;
		} else if(a==8) {
			System.out.println("종료됩니다.");
			return;
		}
		System.out.println("if else");
	}
	public static int doC(int a) {
		return a*a;
	}
	public static void doD() {
		System.out.println("abcdef".substring(3));
		System.out.println("abcdef".substring(3,5));
	}
	public static void main(String[] args) {
		doA();
		doB(7);
		int a = doC(20);
		System.out.println(a);
		doD();
	}
}
