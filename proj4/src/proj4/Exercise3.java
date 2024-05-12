package proj4;

public class Exercise3 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(true) {
			sum += i;
			if(sum >= 1000) break;
			else
				i += 2;
		}
		System.out.println("최초로 1000 이상이 되는 홀수는 : " + i);
		System.out.println("합 : " + sum);
	}

}
