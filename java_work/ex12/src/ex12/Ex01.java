package ex12;
// 생성자

// 메서드
// 밑변과 높이를 저장할 수 있는 생성자
// 밑변과 높이로 넓이를 구하는 메서드
/*
 * 
 */

public class Ex01 {
	public static void main(String[] args) {
		// 기본생성자를 생성해서 메모리에 올림
		Tri t1 = new Tri(10, 20);
		Tri t2 = new Tri();

		System.out.println(t1.toString()); // toString() 생략가능
		System.out.println(t2);
		
		System.out.println(t1.area());
		System.out.println(t2.area());
	}
}
