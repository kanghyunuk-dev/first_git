package ex05;



public class Solution {
	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	public double solution(int[] numbers) {
        double answer = 0;
        int numlen = numbers.length;
        for(int i=0; i < numlen; i++) {
            double numResult = 0;
            numResult += numbers[i];
            answer = numResult / (double)numlen;
        }
        System.out.print(answer);
    }
}
