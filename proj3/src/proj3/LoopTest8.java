package proj3;

public class LoopTest8 {
	public static void main(String[] args) {
		label1:
		for (int i=0; i<5; i++) {
			System.out.println("i = "+i);
			for (int j=0; j<5; j++) {
				if(j==2) continue label1;
				System.out.println("j = "+ j);
			}
			System.out.println();
		}
	}
}
