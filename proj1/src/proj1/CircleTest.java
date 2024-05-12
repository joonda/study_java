package proj1;

public class CircleTest {
	public static void main(String[] args) {
		int radius;
		float circle, area;
		float PI = 3.141592f;
		radius = 5;
		
		circle = 2 * PI * radius;
		area = PI * radius * radius;
		
		System.out.println("radius 5 circle : "+ circle + ", area : " +  area);
		
		radius = 10;
		circle = 2 * PI * radius;
		area = PI * radius * radius;
		
		System.out.println("radius 10 circle : "+ circle + ", area : " +  area);

		
	}

}
