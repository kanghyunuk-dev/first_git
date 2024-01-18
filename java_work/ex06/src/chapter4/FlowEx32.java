package chapter4;
import java.util.*;

class FlowEx32 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("1,2,3 중에 선택\n");

			String tmp = scanner.nextLine(); 
			menu = Integer.parseInt(tmp);    

			if(menu==0) {
				System.out.println("종료");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("square square root 수행 0");
				continue;		
			} else {
				System.out.println("제곱 = " + menu * menu);
				System.out.println("제곱 = " + Math.sqrt(menu));
				System.out.println("제곱 = " + Math.log10(menu));
			}
			
//			System.out.println("�����Ͻ� �޴��� "+ menu +"���Դϴ�.");
		}
	} // main�� ��
}
