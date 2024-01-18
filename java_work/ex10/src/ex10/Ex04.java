package ex10;

public class Ex04 {
	public static void main(String[] args) {
		// 배열 기본형타입 배열 = 0
		// 배열 참조타입 배열 = null
		Tv[] tv = new Tv[100];
		
		//인스턴스화 -> 메모리에 올림
		for(int i=0; i<tv.length; i++) {
			tv[i] = new Tv();
		}
		tv[0] = new Tv();
		tv[1] = new Tv();
		tv[2] = new Tv();
		
		// nullPointerExecption erro 주의
		System.out.println(tv[0]);
		System.out.println(tv[1]);
		System.out.println(tv[2]);
		
		// int 객체
		int[] a = new int[10];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// 객체
		String[] c = new String[10];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	}
}
