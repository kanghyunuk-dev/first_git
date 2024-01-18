package mysqltest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DB db = new DB();
		
		while(true) {
			System.out.println("1.할일입력");
			System.out.println("2.할일목록");
			System.out.println("3.종료");
			System.out.println("번호 입력하세요");
			
			String input = scan.nextLine();
			
			if(input.equals("1")) {
				System.out.println("DB에 할일입력 하기");
				db.insert();
			}
			else if(input.equals("2")) {
				System.out.println("DB에 할일목록 출력");
				db.select();
			} else {
				System.out.println("종료");
			}
		}
		
	}
}
