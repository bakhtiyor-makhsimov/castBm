
public class CastingBm extends StartingBm {
	public void byteToShort() {
		short p_shrt1 = inANDdec.initByte();
		System.out.println("short shrt1 = bt; byte implicitly casted to short, and value is :" + p_shrt1);
		System.out.println("-------------------------------------------");
	}
	public void byteToInt() {
		int p_int1 = inANDdec.initByte();
		System.out.println("int int1 = bt; byte implicitly to int, and value is :" + p_int1);
		System.out.println("-------------------------------------------");
	}
}
