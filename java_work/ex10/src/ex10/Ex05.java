package ex10;

class AA {
	int a = 10;
	static int b =20; // 공유변수 -> 프로그램시작과 동시에 초기화해서 프로그램 끝날때까지 공유되는 변수
	// 많이 사용하는 변수 static
}

public class Ex05 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();
		
		a1.a++;
		System.out.println(a1.a);
		System.out.println(a2.a);
		
		a1.b++;
		System.out.println(AA.b);
		System.out.println(AA.b);
		
//		System.out.println(AA.a); erro - > Class AA 의 static 변수아니라(공유변수가 아니라) 사용불가 -> AA의 a 는 new AA(); 선언이 되어야 메모리할당 -> 사용가능
		
	}
}
