package ex08;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String  todolist[] = new String[100];
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();
			if(select == 1) {
				// 할일 추가
				System.out.println("할일 추가");
				todolist[0] = "공부";
			} else if(select == 2) {
				// 할일 삭제
				todolist[0] = "";
				System.out.println("할일 삭제");
			} else if(select == 3) {
				// 우선순위 부여
				System.out.println("우선순위");
			} else {
				break;
			}			
		}
		System.out.println(todolist[0]);
	}
}
