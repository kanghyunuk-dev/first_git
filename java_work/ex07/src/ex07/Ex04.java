package ex07;

public class Ex04 {
	public static void main(String[] args) {
		// 5
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j < i+1; j++) { 
				System.out.println('*');
				System.out.println(j);
			}
//			System.out.println();
		}
	}
}
