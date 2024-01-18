package aaa;

public class Person {
	private String name; // private - class 내부에서만 사용가능
	private String phone;
	
	public void doAction() {
		System.out.println(name + "이 움직입니다."); // this.name - this 생략가능
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
