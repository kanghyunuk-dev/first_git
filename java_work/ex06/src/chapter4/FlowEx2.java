package chapter4;
import java.util.*; // 

class FlowEx2 {
	public static void main(String[] args) {  
		int input;

		Scanner scanner = new Scanner(System.in);
		input = Integer.parseInt(scanner.nextLine()); 

		if(input==0) {
			System.out.println(input + "입력");	
		}
		if(input!=0)		
			System.out.println("0말고다른것입력 = "+ input);
	}
}
