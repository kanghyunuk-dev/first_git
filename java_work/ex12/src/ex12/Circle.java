package ex12;
/*
 * 반지름설정 - 변수
 * 원넓이 - 메서드
 */
public class CircleBook {
	
	// 다른 클래스에서 해당 변수참조 불가
	private int rad;
	// final - 값 변경불가
	final double PI = 3.14;
	
	public Circle () {}
	public Circle(int rad) {
		this.rad = rad;
	}
	// rad 지정은 해당 메서드에서만 실행
	public void setRad(int r) {
		if(r<0) {this.rad = 0; return;}
		this.rad = r;
	}

	// public - 모든 클래스 호출가능
	public double getArea() {
		return rad * rad * PI;
	}
}
