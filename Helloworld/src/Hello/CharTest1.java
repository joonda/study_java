package Hello;

public class CharTest1 {
	public static void main(String[] args) {
		char ch = 'a';
		int num = 97;
		
		System.out.println("ch의 값 " + ch + ", 아스키 코드 " + (int)ch);
		System.out.println("num의 값 " + num + ", 문자 " + (char)num);
		System.out.println("ch + 1의 값 " + (ch+1) + ", 아스키 코드 " + (int)(ch+1));
		System.out.println("num+1의 값 " + (num+1) + ", 문자 " + (char)(num+1));
	}

}
