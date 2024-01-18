package ex08;

/*
 * Java Stirng function
 * 
 * 
 */

public class Ex01 {
	public static void main(String[] args) {
		String answer = "";
		
		String a = "aaaaa";
		String b = "bbbbb";
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		
		for(int i=0; i < ac.length; i++) {
			System.out.print(ac[i]);
			System.out.print(bc[i]);
			answer = answer + ac[i] + bc[i];
		}
		System.out.println();
		System.out.println("answer = " + answer);
		
		
		for(char temp : ac) {
			System.out.println(temp);
		}
		
//		System.out.println(ac[0]);
//		System.out.println(ac[1]);
//		System.out.println(ac[2]);
//		System.out.println(ac[3]);
		
	}
}
