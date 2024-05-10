package proj1;

public class BoxTest {
	// 클래스 내부에 있는 인스턴스 변수
	
	int width;
	int height;
	int depth;
	
	public static void main(String args[])
	{
		// main 메서드 내의 지역 변수
		int h = 5;
		int w = 5;
		int d = 5;
		
		// class 내의 메서드를 변수로 받는 경우
		BoxTest box = new BoxTest();
		System.out.println("Box의 부피는 "+box.calcVolume(w,h,d)+"입니다.");
	}
	public int calcVolume(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
		
		int vol = width*height*depth;
		return vol;
	}
}
