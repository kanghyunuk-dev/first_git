package chapter4;
import java.util.*;

class FlowEx5 {
	public static void main(String[] args) { 
		int  score = 0;
		char grade = ' ';
		char opt   = '0';

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 
		score = Integer.parseInt(tmp); 

		if (score >= 90) {		      
			grade = 'A';
			if (score >= 98) { 	      
				opt = '+';	
			} else if (score < 94) {  
				opt = '-';
			}
		} else if (score >= 80){	  
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84)	{
				opt = '-';
			}
		} else {				      
			grade = 'C';
		}
		
		if(opt == '0') {
			System.out.println(grade);
		} else {
			System.out.println(grade + "" + opt);
		}
	}
}
