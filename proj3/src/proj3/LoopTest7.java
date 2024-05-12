package proj3;

public class LoopTest7 {
	public static void main(String[] args) {
		// label 지정
		label1:
		for (int i=0; i<5; i++) {
			System.out.println("i = "+i);
			for (int j=0; j<5; j++) {
				// 특정 조건이 만족됐을때, 특정 label을 break 할 수 있다.
				if(j==2) break label1;
				System.out.println("j = "+ j);
			}
			System.out.println();
		}
	}

}
