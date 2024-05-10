package Hello;

public class arraty {
	public static void main(String[] args)
	{
		int[] num;
		num = new int[2];
		
		num[0] = 1;
		num[1] = 2;
		System.out.println("num 배열의 개수 : "+num.length);
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println();
		
		for (int i = 0; i< num.length; i++)
		{
			System.out.println("num : "+num[i]);
		}
	}
}
