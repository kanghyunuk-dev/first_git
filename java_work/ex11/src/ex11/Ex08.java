package ex11;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hieveryone(12, 152.3);
		hieveryone(13, 190);
		System.out.println("프로그램 끝");
	}

	public static void hieveryone(int age, double height) {
		System.out.println("좋은아침");
		System.out.println("나이는 = "+age+"세 입니다");
		System.out.println("키는 = "+height+"cm 입니다");
	}
}
