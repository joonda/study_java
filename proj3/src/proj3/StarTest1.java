package proj3;

public class StarTest1 {
	public static void main(String[] args) {
		int rowNum=5;
		int starNum=5;
		
		for(int i=0; i<rowNum; i++) {
			for(int j=0; j<starNum; j++) {
				// print (줄바꿈 x)
				System.out.print("*");
			}
		// printline의 줄임말 = println (줄바꿈 진행)
		System.out.println();	
		}
	}

}
