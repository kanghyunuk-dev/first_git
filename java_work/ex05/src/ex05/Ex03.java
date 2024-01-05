package ex05;

public class Ex03 {
	public static void main(String[] args) {
		
		char a = 'a';
		
		for(int i = 0; i < 26; i++) {
//			System.out.printf("%d \n", i);
//			System.out.println(i);
			System.out.println(i + "\t" + a++);
		}
		
		a = 'A';
		
		for(int i = 0; i < 26; i++) {
			System.out.println(i + "\t" + a++);
		}
	}
}
