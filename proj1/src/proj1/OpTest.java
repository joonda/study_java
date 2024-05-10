package proj1;

public class OpTest {
	public static void main(String[] args)
	{
		int x = 10;
		int y = 11;
		int z = 11;
		
		System.out.println("x>y = " + (x>y)); // false
		System.out.println("x<y = " + (x<y)); // true
		System.out.println("x<20 = " + (x<20)); // true
		System.out.println("");
		System.out.println("x==y = " + (x==y)); 
		System.out.println("x==10 = " + (x==10)); 
		System.out.println("y==z = " + (y==z)); 
		System.out.println("");
		System.out.println("x!=y = " + (x!=y)); 
		System.out.println("x!=13 = " + (x!=13)); 
		System.out.println("x<=y = " + (x<=y)); 
		System.out.println("x>=y = " + (x>=y)); 

		
	}

}
