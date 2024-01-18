package ex11;

//class A {
//	public void doA() {
//		System.out.println("A doA");
//	}
//}
//class B {
//	public void doB() {
//		System.out.println("B doB");
//	}
//}
//class C {
//	public void doC() {
//		System.out.println("C doC");
//	}
//}

public class Ex07 {
	public static void main(String[] args) {
		boolean[] included = {true, false, false, true, true};
		int[] num = new int[included.length];
		
		for(int i=0; i<included.length; i++) {
			num[i] = i+3;
	    }
	}
}
//	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		a.doA();
//		b.doB();
//		c.doC();
//	}
