package Fundamental1;

public class ConvertDataType {
	static short methodOne(long l)
	 {
		int i = (int) l;
		return (short)i; 
	 }
	 public static void main(String[] args)
	 {
		 double d = 200.2;
		 float f = (float) d; //value tidak berubah,
		 byte b = (byte) d; //desimal menghilang tidak dibulatkan
		 System.out.println(b);
		 System.out.println(d);
		 System.out.println(f);
	 }
}
