package Hello;

public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String address = "서울시 서초구";
		boolean isBoolean = true;
		
		address = "수원시 팔달구";
		
		System.out.println(name+"의 실제 주소는 "+address + "입니다.");
		System.out.println();
		System.out.println("isBoolean의 값은 "+isBoolean + "입니다. ");
		System.out.println();
		
		isBoolean = false;
		
		System.out.println("isBoolean의 값은 " + isBoolean + "입니다.");
	}

}
