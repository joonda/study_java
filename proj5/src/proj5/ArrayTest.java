package proj5;

public class ArrayTest {
	public static void main(String[] args) {
		int [] num;
		num = new int[5];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;

		
		System.out.println("num 배열의 갯수 : " + num.length);
		
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("num[2] = "+num[2]);
		System.out.println("num[3] = "+num[3]);
		System.out.println("num[4] = "+num[4]);
		
		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			System.out.println("num : "+num[i]);
		}
	}

}
