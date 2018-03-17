
public class CastingLongTo extends StartingBm {
	public void longToFloat() {
		float p_flt5 = inANDdec.initLong();
		System.out.println("float flt5 = lng; long implicitly casted to float, and value is :" + p_flt5);
		System.out.println("-------------------------------------------");
	}
	public void longToDouble() {
		double p_dbl5 = inANDdec.initLong();
		System.out.println("double dbl5 = lng; long implicitly casted to double, and value is :" + p_dbl5);
		System.out.println("-------------------------------------------");
	}
	public void longToByte() {
		byte p_bt5 = (byte)inANDdec.initLong();
		System.out.println("byte btg4 = (byte)lng; long explicitly casted to byte, and value is :" + p_bt5);
		System.out.println("-------------------------------------------");
	}
	public void longToShort() {
		short p_shrt5 = (short)inANDdec.initLong();
		System.out.println("short shrt4 = (short)lng; long explicitly casted to short, and value is :" + p_shrt5);
		System.out.println("-------------------------------------------");
	}
	public void longToChar() {
		char p_chr5 = (char)inANDdec.initLong();
		System.out.println("char chr4 = (char)lng; long explicitly casted to char, and value is :" + p_chr5);
		System.out.println("-------------------------------------------");
	}
	public void longToInt() {
		int p_int5 = (int)inANDdec.initLong();
		System.out.println("int int4 = (int)lng; long explicitly casted to char, and value is :" + p_int5);
		System.out.println("-------------------------------------------");
	}
}
