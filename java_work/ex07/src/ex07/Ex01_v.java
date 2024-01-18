package ex07;

public class Ex01_v {
	// charAt()
	// toCharAraay()
	// replace
	// split
	// subString
	
	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		
//		my_string.charAt(s);
		
		return my_string.substring(0, s) + overwrite_string;
//		System.out.println(my_string.substring(5, 8));
//		System.out.println(my_string.substring(7, 10));
		
//		return answer
	}
	public static void main(String[] args) {
		solution("He11oWor1d", "11owor1", 2);
	}
}
