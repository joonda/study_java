package proj10_overriding;

public class Shape {
	protected float area;
	
	public void printArea() {
		System.out.println("도형의 넓이는 " + this.area + " 입니다.");
	}
	
	public void calcArea(float width, float height) {
		this.area = width * height;
	}
}
