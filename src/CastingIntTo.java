
public class CastingIntTo extends StartingBm{
	public void intToLong() {
		long p_lng4 = inANDdec.initInt();
		System.out.println("long lng4 = int; int implicitly casted to long, and value is :" + p_lng4);
		System.out.println("-------------------------------------------");
	}
	public void intToFloat() {
		float p_flt4 = inANDdec.initInt();
		System.out.println("float flt4 = int; int implicitly casted to float, and value is :" + p_flt4);
		System.out.println("-------------------------------------------");
	}
	public void intToDouble() {
		double p_dbl4 = inANDdec.initInt();
		System.out.println("double dbl4 = int; int implicitly casted to double, and value is :" + p_dbl4);
		System.out.println("-------------------------------------------");
	}
	public void intToByte() {
		byte p_bt4 = (byte)inANDdec.initInt();
		System.out.println("byte bt4 = (byte)int; int explicitly casted to byte, and value is :" + p_bt4);
		System.out.println("-------------------------------------------");
	}
	public void intToShort() {
		short p_shrt4 = (short)inANDdec.initInt();
		System.out.println("short shrt4 = (short)int; int explicitly casted to short, and value is :" + p_shrt4);
		System.out.println("-------------------------------------------");
	}
	public void intToChar() {
		char p_char4 = (char)inANDdec.initInt();
		System.out.println("char char4 = (char)int; int explicitly casted to char, and value is :" + p_char4);
		System.out.println("-------------------------------------------");
	}
}
