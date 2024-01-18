package chapter4;
import java.util.*;

class FlowEx7 {
	
	public static void main(String[] args) { 
		int user, com;

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 
		user = Integer.parseInt(tmp);    
		
		// Math.random()
		// 0 < x < 1
		// * 3 -> 0 < x < 3 
		com = (int)(Math.random() * 3) + 1;
		// System.out.println(com);

		switch(user-com) {
			case 2: case -1:
				System.out.println(user + " - " + com + " = " + (user-com));
				System.out.println("2 or -1");
				break;
			case 1: case -2:
				System.out.println(user + " - " + com);
				System.out.println("1 or -2");
				break;
			case 0:
				System.out.println(user + " - " + com);
				System.out.println("0");
				break;
			default:
				System.out.println(user + " - " + com);
				System.out.println("default");
		}
	} 
}
