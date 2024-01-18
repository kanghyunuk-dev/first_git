package ex01;

/*
 * 정수가 담긴 리스트 num_list가 주어집니다. 
 * num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 
 * return하도록 solution 함수를 완성해주세요.
 */

// Kanghyun class -> Solution class 의 solution 메서드 호출
// Solution class의 solution 메서드 준비
// 짝수만 붙인수, 홀수만 붙인수 를 담을 변수 준비
// num_list 배열의 숫자를 뽑아오기 -> for문 활용
// num_list 배열의 숫자중 짝수, 홀수 나누기 -> if문 활용
// StringBuilder 의 append 메서드를 활용해 짝수, 홀수 변수에 담기 - 담을때 결과값을 위해 문자열로 변경 -> Integer.toString 활용
// 짝수 홀수 를 더한값 -> answer 에 담기 -> answer 값 return
// main 함수에서 solution 함수 호출 -> 결과값 확인


class Solution {
	int answer = 0;
	public int solution(int[] num_list) {
		// 짝수만 붙인 수(문자열)
		// 홀수만 붙인 수(문자열)
//		String even = "";
//		String odd = "";
		// StringBuilder 사용시 성능향상
		// String 객체 선언은 불러 올때마다 새로운 객체를 선언 StringBuilder는 선언된 객체내용만 반환 -> 문자열을 붙이는 경우 효율적
//		JDK1.5 버전 이후에는 컴파일 단계에서 String 객체를 사용하더라도 StringBuilder로 컴파일 되도록 변경
		StringBuilder evenStr = new StringBuilder();
		StringBuilder oddStr = new StringBuilder();

		for(int i=0; i<num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
//				even += num_list[i];
				evenStr.append(Integer.toString(num_list[i]));
				
			} else {
//				odd += num_list[i];
				oddStr.append(Integer.toString(num_list[i]));
			}
		}
		System.out.println("evenStr = " + evenStr.toString());
		System.out.println("addStr = " + oddStr.toString());
//		answer = Integer.parseInt(even) + Integer.parseInt(odd); 
		answer = Integer.parseInt(evenStr.toString()) + Integer.parseInt(oddStr.toString());
		System.out.println(answer);
		return answer;
	}
}

public class Kanghyun {
	static int[] num_list = {3,4,5,2,1};
	static int[] num_list2 = {5,7,8,3};
	int reuslt = 0;
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution(num_list);
		solution.solution(num_list2);
	}
}
