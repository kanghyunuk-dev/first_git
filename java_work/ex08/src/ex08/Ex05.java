package ex08;

public class Ex05 {
	public static void main(String[] args) {
		// i == 0 일때 j == 0~9
		// i == 1 일때 j == 0~9
		// i == 2 일때 j == 0~9
		// ..
		// i == 9 일때 j == 0~9
		aa: for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for(int j=0; j<10; j++) {
				if(j == 3 || j == 6 || j == 9 ) {
					continue;
				}
				if(j==7) {
					i++;
					System.out.println("7 check!");
					continue aa; // aa for 문을 멈춤 -> aa 명시하기
				}
				System.out.println("\t j = " + j);
			}
		}
	}
}
