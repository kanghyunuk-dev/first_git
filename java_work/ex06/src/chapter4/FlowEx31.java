package chapter4;
class FlowEx31 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
//				System.out.println(i + "가 뭐 일때 continue 됨");
				continue;
			System.out.println(i);
		}
		
		System.out.println("4의 배수");
		for(int i=0;i <= 100;i++) {
			if (i%4==0)
//				System.out.println(i + "가 뭐 일때 continue 됨");
				continue;
			System.out.println(i);
		}
	}
}
