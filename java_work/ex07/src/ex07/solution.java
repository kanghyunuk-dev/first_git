package ex07;

public class solution {
	public int solution(int[] numbers) {
        int max = numbers[0];
        int prev = 0;
        for(int i=1; i<numbers.length; i++){
            if(max < numbers[1]){
            	// numbers 0번째 1번째 비교 -> 1번째 크면 true 실행
                prev = max; // prev 에 numbers 1번째 담음
                max = numbers[1]; // numbers 1번째가 max numbers 0번째 보다 크니 max를  numbers
            }else if(prev < numbers[1]){
                prev = numbers[1];
            }
        }

        return prev*max;
    }
	public static void main(String[] args) {
		// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
		
	}
}
