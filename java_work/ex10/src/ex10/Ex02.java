package ex10;

/*
 * Tv 라는 객체 클래스 만들기
 * 
 * 변수, 메소드
 */



public class Ex02 {
	public static void main(String[] args) {
		int a = 10;
		Tv tv1 = new Tv();
		
		System.out.println(tv1.color);
		System.out.println(tv1.power);
		System.out.println(tv1.channel);
		
		tv1.power();
		System.out.println(tv1.power);
		
		tv1.channelDown();
		tv1.channelUp();
	}

}
