package proj4;

public class Exercise2 {
	public static void main(String[] args) {
		int n1 = 150;
		int n2 = 300;
		
		for(int i=1; i<=n1;i++) {
			if(n1%i==0 && n2%i==0)
				System.out.println(i+"는 "+n1+"과 "+n2+"의 공약수 입니다." );
		}
	}
}
