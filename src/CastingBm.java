
public class CastingBm extends StartingBm {
	public void byteToShort() {
		short p_shrt1 = inANDdec.initByte();
		System.out.println("short shrt1 = bt; byte implicitly casted to short, and value is :" + p_shrt1);
		System.out.println("-------------------------------------------");
	}
	public void byteToInt() {
		int p_int1 = inANDdec.initByte();
		System.out.println("int int1 = bt; byte implicitly casted to int, and value is :" + p_int1);
		System.out.println("-------------------------------------------");
	}
	public void byteToLong() {
		long p_lng1 = inANDdec.initByte();
		System.out.println("long lng1 = bt; byte implicitly casted to long, and value is :" + p_lng1);
		System.out.println("-------------------------------------------");
	}
	public void byteToFloat() {
		float p_flt1 = inANDdec.initByte();
		System.out.println("float flt1 = bt; byte implicitly to casted to float, and value is :" + p_flt1);
		System.out.println("-------------------------------------------");
	}
	public void byteToDouble() {
		double p_dbl1 = inANDdec.initByte();
		System.out.println("double dbl1 = bt; byte implicitly to casted to double, and value is :" + p_dbl1);
		System.out.println("-------------------------------------------");
	}
}
