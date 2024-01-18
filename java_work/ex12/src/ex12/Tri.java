package ex12;

public class Tri {
	int width;
	int height;

	// 다른생성자 -> 기본생성자 생략불가
	public Tri() {}

	public Tri(int width, int height) {
//		super(); // 생략가능
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Tri [width=" + width + ", height=" + height + "]";
	}
	
	// 넓이 구하는 메서드
	public double area() {
		return width * height * 0.5;
	}
}
