package Hello;

public class ScoreTest {
	public static void main(String[] args) {
		int score = 89;
		int category = 0;
		String credit;
		category = score/10;
		System.out.println("Category = "+category);
		
		switch(category)
		{
		case 10:
			credit = "A";
			break;
		case 9:
			credit = "A";
			break;
		case 8:
			credit = "B";
			break;
		case 7:
			credit = "C";
			break;
		case 6:
			credit = "D";
			break;
		default:
			credit = "F";
			break;
		}
	}

}
