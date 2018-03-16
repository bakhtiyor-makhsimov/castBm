
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

}
