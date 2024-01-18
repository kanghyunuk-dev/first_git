package ex06;

public class Ex01 {
	/*
	 * String -> int
	 * integer.parseInt(변수명);
	 * String -> double
	 * Double.parseDoube(변수명);
	 * String -> float
	 * Float.parseFloat(변수명);
	 */
	public static int solution(int a, int b) {
		int result1 = Integer.parseInt(a+""+ b);
		int result2 = Integer.parseInt(b+""+ a);
		System.out.println(Integer.parseInt(a+""+ b));
		System.out.println(Integer.parseInt(b+""+ a));
		
		if(result1 < result2) {
			return result2;
		} else 
			return result1;
		
	}
	public static void main(String[] args) {
		int a = 12;
		int b = 3;
		
		int result = solution(a, b);
		System.out.println(result);
	}
}
