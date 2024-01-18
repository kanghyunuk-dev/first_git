package ex12;

class Point {
	int xPos, yPos;
	// 좌표저장
	public Point(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	// 좌표정보 출력
	public void showPointInfo() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}
}
class Circle {
	Point p;
	int rad;
	Circle(Point p, int rad) {
		this.p = p;
		this.rad = rad;
	}
	public void showCircleInfo() {
		p.showPointInfo();
		System.out.println("rad = " + rad);
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Point p1 = new Point(5, 10);
		p1.showPointInfo();
		
		Circle c = new Circle(p1, 5);
		c.showCircleInfo();
	}
}
