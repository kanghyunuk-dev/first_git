package chapter4;
import java.util.*;

class FlowEx28 {
	public static void main(String[] args) { 
		int input  = 0;
		int answer = 0;

		answer = (int)(Math.random() * 100) + 1;
		// 0 < x < 1
		// 0 < x < 100
		// 0.00001 < x < 99.99999
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("");

			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);

			if(input > answer) {
				System.out.println("");	
			} else if(input < answer) {
				System.out.println("");			
			}
		} while(input!=answer);

		System.out.println("");
	}
}
