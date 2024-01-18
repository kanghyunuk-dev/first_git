package ex10;

public class Ex09 {
	Ex09() {
		System.out.println("기본생성자");
	}
	public static void doA() {
		System.out.println("static 함수");
	}
	public void doB() {
		System.out.println("non-static 함수");
	}
	public static void main(String[] args) {
		Ex09 ex09 = new Ex09();
		doA();
	
		Ex09.doA(); // static 함수 적절한 표현
		
		ex09.doB();
	}
}
