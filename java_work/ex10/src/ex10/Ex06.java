package ex10;

// 생략가능
// import java.lang.*
// 기본생성자

public class Ex06 {
	
	//클래스 함수는 인스턴스화 해야지만 사용가능
	void doA() {
		System.out.println("doA 메서드");
	}
	
	// static은 메모리 공간에 항상 상주
	public static void doB() { 
		System.out.println("doB 메서드");
	}
	
	//art + shift + s -? c 기본생성자 만들기
	
	// 기본생성자 -> 생략가능
//	Ex06() {
//		System.out.println("기본 생성자");
//	}
	public static void main(String[] args) {
//		Ex06 ex06 = new Ex06();
		Ex06 ex06 = new Ex06();
		ex06.doA();
		
		Ex06 doa = new Ex06();
		
//		Ex06.doA();
		doa.doA();
		doa.doB();
		Ex06.doB();
//		Ex06.doA();
		
	}
}
