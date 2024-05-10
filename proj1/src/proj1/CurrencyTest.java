package proj1;

public class CurrencyTest {
	public static void main(String[] args)
	{
		int won = 354000;
		int rate = 960;
		float dollar;
		
		dollar = won/rate;
		
		System.out.println(won + " to dollar : " + dollar + "$");
		
		// float won / float rate
		dollar = (float)won/(float)rate;
		System.out.println(won + " to dollar : " + dollar + "$");
		
		// float (won/rate)
		dollar = (float) won/rate;
		System.out.println(won + " to dollar : " + dollar + "$");
		
		// int dollar * rate -- int dollar와 rate
		won = (int)dollar * rate;
		System.out.println(dollar + " to won : " + won + " won");
		
		// int(dollar * rate) -- dollar 와 rate 값을 int로
		won = (int)(dollar * rate);
		System.out.println(dollar + " to won : " + won + " won");
	}

}
