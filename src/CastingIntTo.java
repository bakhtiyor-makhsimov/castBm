
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
}
