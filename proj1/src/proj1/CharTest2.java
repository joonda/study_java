package proj1;

public class CharTest2 {
	public static void main(String[] args)
	{
		char ch1 = 'h';
		char ch2 = 'e';
		char ch3 = 'l';
		char ch4 = 'l';
		char ch5 = 'o';
		
		System.out.println(ch1+ch2+ch3+ch4+ch5);
		System.out.println(ch1+""+ch2+""+ch3+""+ch4+""+ch5+"");
		System.out.println((char)(ch1-32)+""+
							(char)(ch2-32)+""+
							(char)(ch3-32)+""+
							(char)(ch4-32)+""+
							(char)(ch5-32)+"");
	}

}
