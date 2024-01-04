package ex03;
/*
 * 
 */
public class Ex09 {
	public static void main(String[] args) {
		double d = 85.4d;
		int score = (int)d;
		System.out.println("score = " + score);
		System.out.println("d = " + d);
		
		// 비트체계 작은것에서 큰것 으로 변활 될때 자료소실이 없음 -> 형변환 안적어도 자동형변환
		int aa = 10; // 
		double ee = aa; // 정수보다 소수가 더 많은 수표현
		System.out.println("aa = " + aa);
		System.out.println("ee = " + ee);
	}
}
