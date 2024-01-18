package chapter4;
import java.util.*;

class FlowEx27 {
	public static void main(String[] args) { 
//		int num; 
		int num = 0; // 초기화 시켜주기
		int sum = 0;
		boolean flag = true;   

		System.out.println(")");

		while(flag) {    
			System.out.print(">>");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);  

			if(num!=0) {  
				sum += num; 
			} else {
				flag = false;   
			}
		} 

		System.out.println("�հ�:"+ sum);
	}
}
