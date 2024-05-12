package proj4;

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
		
		while(true) {
			sum += n;
			if(sum>=1000)
				break;
			else
				n++;
		}
		System.out.println("1000 이상이 되게 하는 최초의 수는 : "+n);
		System.out.println("n까지 더한 합은 : "+sum);
	}

}
