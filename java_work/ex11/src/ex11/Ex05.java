package ex11;

public class Ex05 {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		System.out.println(d1);
		System.out.println(d1.toString()); // toString 생략되어짐
		
		Ex05 ex05 = new Ex05(); // 인스턴스화 -> 메모리올라감
		
		Data d2 = ex05.copy(d1); // 새로운영역
//		Data d2 = d1; // 참조같음 
		
//		Data d2 = d1;
		System.out.println(d2);
		
		d2.x = 200;
		System.out.println(d1);
	}
	Data copy(Data d) {
		Data data = new Data();
		return data;
	}
}

class Data {
	int x = 10;

	@Override
	public String toString() {
		return "Data [x=" + x + "]";
	}
	
	
}
