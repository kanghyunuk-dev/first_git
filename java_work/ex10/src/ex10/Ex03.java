package ex10;

public class Ex03 {
	public static void main(String[] args) {
		// 캡슐화
		// class Tv 안에는 채널, 색상, 전원 .. 변수.. 
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		tv1.channel = 10;
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
		tv1.channelUp();
		System.out.println(tv1.channel);
	}
}
