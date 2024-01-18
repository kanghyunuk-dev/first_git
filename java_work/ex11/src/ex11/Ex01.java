package ex11;

import javax.print.attribute.standard.PDLOverrideSupported;

// 연락처 관리 프로그램

public class Ex01 {
	public static void main(String[] args) {
		
//		String[] name = new String[10];
//		String[] phone = new String[10];
//		String[] gender = new String[10];
		
		// 데이터관리 용이 -> class 객체 활용
		// class 객체 배열선언
		Person[] p = new Person[10];
		
		
		p[0] = new Person();
		p[0].name = "홍길동";
		
		p[0].setPerson("이길동", "010-2222-1111", "남자", "text");
			
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		
	}
}
