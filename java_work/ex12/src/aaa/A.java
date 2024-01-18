package aaa;

public class A {
	int num = 10;
}
// B 가 A 상속 받음
public class B extends A {
	int num = 20;
	public void doNum() {
		System.out.println(num);
	}
}
