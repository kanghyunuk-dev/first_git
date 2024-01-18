package ex13;

class AA {
	public void doPrint() {
		System.out.println("static doPrint()");
	}
}

class AAA {
	public static void doA() {
		AA aa = new AA();
		System.out.println("AAA doA");
		aa.doPrint();
	}
}
public class Ex03 {
	public static void main(String[] args) {
		AAA aa = new AAA();
		aa.doA();
		
		System.out.println("테스트");
	}	
}
