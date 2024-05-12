package proj2;

public class ScoreTest {
	public static void main(String[] args) {
		int score = 89;
		int category = 0;
		String credit;
		
		if(score >=0 && score<=100) {
		category = score / 10;
		System.out.println("score : "+category);
		
		if(category == 10 || category == 9)
			credit = "A";
		else if(category == 8)
			credit = "B";
		else if(category == 7)
			credit = "C";
		else if(category == 6)
			credit = "D";
		else
			credit = "F";
		
		System.out.println("시험 점수 : "+score+"점, 학점 : "+credit);
		}
		else {
			System.out.println("시험 점수가 잘못 입력되었습니다.");
		}
		}

}
