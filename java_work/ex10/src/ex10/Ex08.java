package ex10;

public class Ex08 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println(t1.channel);
		System.out.println(t1.power);
		
		System.out.println(t2.channel);
		System.out.println(t2.power);
		
		t1.channel++;
		t1.power();
		System.out.println();
	}
}
