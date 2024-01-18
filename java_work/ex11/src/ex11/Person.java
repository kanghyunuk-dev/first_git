package ex11;

public class Person {
	
	String name;
	String phone;
	String gender;
	String remark;
	int age;
	
	public void initValue(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
//	public Person() {
//		
//	}
	// 다른생성자를 선언하게 되면 기본생성자는 생략불가
	public Person(String name, String phone, String gender, String remark, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.remark = remark;
		this.age = age;
	}
	
//	public Person() {
//		System.out.println("기본생성자");
//	}
//	
//	// name, phone, gender, remark 설정하는 메서드
//	public void setPerson(String name, String phone, String gender, String remark) {
//		// class 에 있는 name,phone,gender,remark
//		this.name = name;
//		this.phone = phone;
//		this.gender = gender;
//		this.remark = remark;
//	}
//
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", phone=" + phone + ", gender=" + gender + ", remark=" + remark + "]";
//	}
	
}
