package abc;

public class Demo65 {

	public static void main(String[] args) {
		byte b1=10;
		Byte B1=new Byte(b1);
		Byte B5=new Byte("10");
		
		Byte B2=Byte.valueOf((byte)10);
	
		Byte B4=Byte.valueOf("10");
		System.out.println(B1);
		
		System.out.println(B2.equals(B5));
		System.out.println(B2==B5);
	}
	

}
