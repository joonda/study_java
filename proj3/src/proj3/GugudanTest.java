package proj3;

public class GugudanTest {
	public static void main(String[] args) {
		int dan = 9;
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
	}
}
