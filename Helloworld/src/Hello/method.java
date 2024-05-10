package Hello;

public class method {
	public void print(int a)
	{
		System.out.println("결과 값 = " + a);
	}

	public static void main(String[] args)
	{
		int a = 11;
		int b = 22;
		int result = 0;
		
		method m = new method();
		result = a+b;
		
		m.print(10);
		m.print(b);
		m.print(result);
	}
}
