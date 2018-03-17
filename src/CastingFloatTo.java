
public class CastingFloatTo extends StartingBm {
	public void floatToDouble() {
		double p_dbl6 = inANDdec.initFloat();
		System.out.println("double dbl6 = flt; float implicitly casted to double, and value is :" + p_dbl6);
		System.out.println("-------------------------------------------");
	}
	public void floatToByte() {
		byte p_bt6 = (byte)inANDdec.initFloat();
		System.out.println("byte bt6 = (byte)flt; float explicitly casted to byte, and value is :" + p_bt6);
		System.out.println("-------------------------------------------");
	}
	public void floatToShort() {
		short p_shrt6 = (short)inANDdec.initFloat();
		System.out.println("short shrt6 = (short)flt; float explicitly casted to short, and value is :" + p_shrt6);
		System.out.println("-------------------------------------------");
	}
	public void floatToChar() {
		char p_chr6 = (char)inANDdec.initFloat();
		System.out.println("char chr6 = (char)flt; float explicitly casted to char, and value is :" + p_chr6);
		System.out.println("-------------------------------------------");
	}
	public void floatToInt() {
		int p_int6 = (int)inANDdec.initFloat();
		System.out.println("int int6 = (int)flt; float explicitly casted to int, and value is :" + p_int6);
		System.out.println("-------------------------------------------");
	}
	public void floatToLong() {
		long p_lng6 = (long)inANDdec.initFloat();
		System.out.println("long lng6 = (long)flt; float explicitly casted to long, and value is :" + p_lng6);
		System.out.println("-------------------------------------------");
	}
}
