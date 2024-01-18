package ex09;

public class Ex02 {
	public static int solution(int[] num_list) {
		int answer = 0;
		
		int rhq = num_list[0];
		int gkqdmlwprhq = num_list[0];
		
		for(int i=1; i<num_list.length; i++) {
			rhq = rhq * num_list[i];
			gkqdmlwprhq += num_list[i];
		}
		System.out.println(rhq);
		System.out.println(gkqdmlwprhq*gkqdmlwprhq);
		
		if(rhq > gkqdmlwprhq*gkqdmlwprhq)
			answer = 0;
		else
			answer = 1;
		
		System.out.println(answer);
		return answer;
		
	}
	public static void main(String[] args) {
		int[] num_list = {5,7,8,3};
		
		solution(num_list);
//		System.out.println(3 * 4 * 5 * 2 *1);
//		System.out.println((3 + 4 + 5 + 2 + 1) * (3 + 4 + 5 + 2 +1));
		
//		System.out.println(5 * 7 * 8 * 3);
//		System.out.println((5 + 7 + 8 + 3) * (5 + 7 + 8 + 3));
	}
}
