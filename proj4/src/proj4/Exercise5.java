package proj4;

public class Exercise5 {
	public static void main(String[] args) {
		int num = 2;
		int count = 0;
		int order = 0;
		
		while(true) {
			for(int i = 1; i<=num; i++) {
				if(num%i == 0) {
					count++;
				} // num의 약수 개수를 구함.
			}
			// for문을 벗어나, count의 개수가 2개라면, order 1증가
			if(count == 2) 
				order++;
			// order가 20이라면 break.
			if(order == 20) {
				break;
			}
			// 아니라면, count를 초기화하고, num 1증가
			else {
				count = 0;
				num++;
			}
		}
		System.out.println("자연수에서 "+order+"번째 소수는 "+num+"입니다.");
	}
}