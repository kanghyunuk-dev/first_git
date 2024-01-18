package ex10;
// class 에는 기본생성자 생성필요 - 기본생성자 매개변수 없거나 기본생성자가 하나로도 없을시 자동으로 기본생성자 생성
// 모든 class 에는 기본생성자 자동으로 생성
class Abc {
	// 생성자목적 - 생성자는 객체가 생성될때 자동으로 호출되는 특수목적의 멤버함수(메소드) -> 객체초기화를 위해 필요
	String a;
	int b;
	Abc() {
		// 기본생성자 - 생략됨
	}
	Abc(String a, int b) {
		// 매개변수 있는 생성자
		this.a = a;
		this.b = b;
	}
	
	void abcShow() {
		System.out.println("a = "+ a + " b = "+ b);
	}
	
}

public class Study_1 {
	public static void main(String[] args) {
		// 객체생성
		Abc abc1 = new Abc(); // 기본생성자
		Abc abc2 = new Abc("abc", 0); // 매개변수 있는 생성자
		
		abc1.abcShow();
		
		
	}
}
