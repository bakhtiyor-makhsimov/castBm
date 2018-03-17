
public class CastingDoubleTo extends StartingBm{
	public void doubleToByte() {
		byte p_bt7 = (byte)inANDdec.initDouble();
		System.out.println("byte bt7 = (byte)dbl; double explicitly casted to byte, and value is :" + p_bt7);
		System.out.println("-------------------------------------------");
	}
	public void doubleToShort() {
		short p_shrt7 = (short)inANDdec.initDouble();
		System.out.println("short shrt7 = (short)dbl; double explicitly casted to short, and value is :" + p_shrt7);
		System.out.println("-------------------------------------------");
	}
	public void doubleToChar() {
		char p_chr7 = (char)inANDdec.initDouble();
		System.out.println("char chr7 = (char)dbl; double explicitly casted to char, and value is :" + p_chr7);
		System.out.println("-------------------------------------------");
	}
	public void doubleToInt() {
		int p_int7 = (int)inANDdec.initDouble();
		System.out.println("int int7 = (int)dbl; double explicitly casted to int, and value is :" + p_int7);
		System.out.println("-------------------------------------------");
	}
	public void doubleToLong() {
		long p_lng7 = (long)inANDdec.initDouble();
		System.out.println("long lng7 = (long)dbl; double explicitly casted to long, and value is :" + p_lng7);
		System.out.println("-------------------------------------------");
	}
	public void doubleToFloat() {
		float p_flt7 = (float)inANDdec.initDouble();
		System.out.println("float flt7 = (float)dbl; double explicitly casted to float, and value is :" + p_flt7);
		System.out.println("-------------------------------------------");
	}
}
