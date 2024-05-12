package proj1;

public class TempTest {
	public static void main(String[] args){
		int BASE = 32;
		float celsius = 0f, fahrenheit = 0f;
		fahrenheit = 100;
		
		celsius = (fahrenheit - BASE)* 5.0f / 9.0f;
		System.out.println("화씨 " + fahrenheit + "도에 대한 섭씨는 " + celsius);
		
		fahrenheit = celsius * 9.0f / 5.0f + BASE;
		System.out.println("섭씨 " + celsius + "도에 대한 화씨는 " + fahrenheit);
		
	}
}
