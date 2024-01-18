package ex10;

public class Solution {
	public Solution() {
		String num = "98495846";
		solution(num);
	}
	
	public int solution(String number) {
		int answer = 0;
		char[] arr = number.toCharArray();
		int[] brr = new int[arr.length];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			brr[i] = arr[i] - 48;
		}
		
		
		System.out.println((int)brr[0]);
		System.out.println((int)brr[1]);
		
		return answer;
	}
	public static void main(String[] args) {
		new Solution();
	}
}
