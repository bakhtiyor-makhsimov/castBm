
public class CastingShortTo extends StartingBm {
	public void shortToInt( ) {
		int p_int2 = inANDdec.initShort();
		System.out.println("int int2 = shrt; short implicitly casted to int, and value is :" + p_int2);
		System.out.println("-------------------------------------------");
	}
	public void shortToLong( ) {
		long p_lng2 = inANDdec.initShort();
		System.out.println("long lng2 = shrt; short implicitly casted to long, and value is :" + p_lng2);
		System.out.println("-------------------------------------------");
	}
	public void shortToFloat( ) {
		float p_flt2 = inANDdec.initShort();
		System.out.println("float flt2 = shrt; short implicitly casted to float, and value is :" + p_flt2);
		System.out.println("-------------------------------------------");
	}
	public void shortToDouble( ) {
		double p_dbl2 = inANDdec.initShort();
		System.out.println("double dbl2 = shrt; short implicitly casted to double, and value is :" + p_dbl2);
		System.out.println("-------------------------------------------");
	}

}
