package ex08;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/*
		 *  260000 4 20000 5 30000 2 10000 6 5000 8
		 *  
		 *  250000 4 20000 5 30000 2 10000 6 5000 8
		 */
		Scanner scan = new Scanner(System.in);
		int total = 0; 
		int productCnt = 0;
		int calcu_total = 0;
		
		total = scan.nextInt();
		productCnt = scan.nextInt();
 		
		// 배열생성
		int[] itemPrice = new int[productCnt];
		int[] itemCnt = new int[productCnt];
		// item 입력
		for(int i=0; i<productCnt; i++) {
			String temp = scan.nextLine();
			itemPrice[i] = Integer.parseInt(temp.split("")[0]);
			itemCnt[i] = Integer.parseInt(temp.split("")[0]);
		}
		
		// 총값
		for(int i=0; i<productCnt; i++) {
			calcu_total = calcu_total + (itemPrice[i] * itemCnt[i]);
		}
		
		// 출력
		if(total == calcu_total) 
			System.out.println("yes");
		else
			System.out.println("no");
		
		// item 출력
		for(int i=0; i<productCnt; i++) {
			System.out.println("itemPrice ="+itemPrice[i]);
			System.out.println("itemCnt ="+itemCnt[i]);
		}
	}
}
