package ex11;

public class Ex11 {
	public static void main(String[] args) {
//		hiEveryOne("홍길동", 12, "남성");
		
//		Person p1 = new Person();
		Person p1 = new Person("이길동", null, "남자", null, 20);
//		p1.name = "이길동";
//		p1.age = 12;
//		p1.gender = "여자";
//		p1.("이길동", 12, "여자"); // 많이 사용하는 방식
		
		hiEveryOne(p1);
		
	}
//	static void hiEveryOne(String name, int age, String gender) {
//		System.out.println(name+ "입니다\n" + age + "세입니다\n" + gender + "입니다");
//	}
	static void hiEveryOne(Person p) {
		System.out.println(p.name+ "입니다\n" + p.age + "세입니다\n" + p.gender + "입니다");
	}
}
