package ex06;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("현재 시간 입력");
		String hourMin = scan.nextLine();
		int hour = Integer.parseInt(hourMin.split(" ")[0]);
		int min = Integer.parseInt(hourMin.split(" ")[1]);
		
		System.out.println("현재시간 = " + hour + "시" + min + "분");
		System.out.println("걸리는 시간 입력");
		int forMin = scan.nextInt();
		System.out.println("걸리는시간 = " + forMin + "분");
		
		min = min + forMin;
		if(min >= 60) {
			System.out.println(min / 60);
			System.out.println((double)min / 60);
			hour = hour + min / 60;
			min = min % 60;
		}
		if (hour >= 24) {
			hour = hour % 24;
		}
		System.out.println("요리후 시간 = " + hour + "시 " + min + "분");
	}
}
