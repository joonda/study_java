package proj1;

public class CharTest1 {
	public static void main(String[] args)
	{
		char ch = 'a';
		int num = 97;
		
		// ch는 a, int로 형변환 시 a의 아스키 코드 값인 97
		System.out.println("val ch : "+ch+", ascii : "+(int)ch);
		
		// num은 97, char로 형 변환 시, 문자 a
		System.out.println("val num : "+num+", char : "+(char)num);
		
		// ch+1은 숫자로 인식, 97+1인 98, char는 b
		System.out.println("val ch + 1 : "+(ch+1)+", char : "+(char)(ch+1));
		
		// num+1은 98, char는 b
		System.out.println("val num + 1 : "+(num+1)+", char : "+(char)(num+1));
		
		
	}

}
