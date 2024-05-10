package Hello;

public class DataConversionTest {
	
	public static void main(String [] args){
		byte bVar1 = 12;
		byte bVar2 = 17;
		byte bVar3 = (byte)(bVar1 + bVar2);
		System.out.println("bVar2 : "+bVar2);
		
		short sVar1 = 12;
		short sVar2 = 17;
		
		short sVar3 = (short)(sVar1 + sVar2);
		System.out.println("sVar3 : "+sVar3);
		
		int i1 = 4;
		int i2 = 5;
		int i3 = i1+i2;
		
		System.out.println("i3 : "+i3);
		
		double h = 3.14F;
		float f = (float)3.14;
		
		float f2 = 3.14F+3.14F;
		System.out.println("f2 : "+f2);

		
	}
}
