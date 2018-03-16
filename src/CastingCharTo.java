
public class CastingCharTo extends StartingBm{
	public void charToInt() {
		int p_int3 = inANDdec.initChar();
		System.out.println("int int3 = char; char implicitly casted to int, and value is :" + p_int3);
		System.out.println("-------------------------------------------");
	}
	public void charToLong() {
		long p_lng3 = inANDdec.initChar();
		System.out.println("long lng3 = char; char implicitly casted to long, and value is :" + p_lng3);
		System.out.println("-------------------------------------------");
	}
	public void charToFloat() {
		float p_flt3 = inANDdec.initChar();
		System.out.println("float flt3 = char; char implicitly casted to float, and value is :" + p_flt3);
		System.out.println("-------------------------------------------");
	}
	public void charToDouble() {
		double p_dbl3 = inANDdec.initChar();
		System.out.println("double dbl3 = char; char implicitly casted to double, and value is :" + p_dbl3);
		System.out.println("-------------------------------------------");
	}
	public void charToByte() {
		byte p_bt3 = (byte)inANDdec.initChar();
		System.out.println("byte bt3 = (byte)char; char explicitly casted to byte, and value is :" + p_bt3);
		System.out.println("-------------------------------------------");
	}
	public void charToShort() {
		short p_shrt3 = (short)inANDdec.initChar();
		System.out.println("short shrt3 = (short)char; char explicitly casted to short, and value is :" + p_shrt3);
		System.out.println("-------------------------------------------");
	}
}
