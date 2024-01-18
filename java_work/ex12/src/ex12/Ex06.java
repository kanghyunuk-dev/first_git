package ex12;

class Accumulator {
//	static int num = 0;
	static int sum = 0;
//	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			Accumulator.add(i);
//		}
//		Accumulator.showResult();
//	}
//	static int add(int i) {
//		return num += i;
//	}
//	static int showResult() {
//		System.out.println(num);
//		return num;
//	}
	
	public static void add(int i) {
		sum += i;
	}
	public static void showResult() {
		System.out.println();
	}
}

public class Ex06 {
	public static void main(String[] args) {
//		new Accumulator();
		
		for(int i=0; i<10; i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();
	}
}
