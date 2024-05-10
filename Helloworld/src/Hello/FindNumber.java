package Hello;

public class FindNumber {
	public Integer summarize(int x) {
		
		int sum = 0;
		int i = 1;
		while(sum < x) {
			sum = sum +i;
			i = i+2;
		}
		return i ;
		
	}
	
}