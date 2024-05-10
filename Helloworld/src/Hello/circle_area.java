package Hello;

public class circle_area {
	public static void main(String[] args) {

	int radius;
	float circum, area;
	float PI=3.141592f;
	radius = 5;
	
	circum = 2*PI*radius;
	area = PI*radius*radius;
	System.out.println("반지름이 "+radius+"인 \n원의 둘레:"+circum+"\n면적:"
			+area+" 입니다.");
	}
}
