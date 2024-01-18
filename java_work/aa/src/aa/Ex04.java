package aa;

public class Ex04 {
	public static void main(String[] args) {
		aa:for(int i = 0; i<5; i++) {
//			System.out.println(i);
			if(i==2)
				continue aa; // continue 라벨링
			System.out.println(i);
		}
	}
}
