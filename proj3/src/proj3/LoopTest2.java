package proj3;

public class LoopTest2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<10; i+=2) {
			sum+=i;
			System.out.println("sum : "+sum);
		}
	}

}
