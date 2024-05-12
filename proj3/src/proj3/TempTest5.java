package proj3;

public class TempTest5 {
	public static void main(String[] args) {
		int BASE = 32;
		float celsius = 0f;
		
		for(int fahrenheit=0; fahrenheit<=100; fahrenheit+=10) {
			celsius = (fahrenheit-BASE)*5.0f/9.0f;
			if(fahrenheit == 50)
				continue;
			System.out.println("fahrenheit : " + fahrenheit+"도 \t celsius : "+celsius+"도");
		}
}}