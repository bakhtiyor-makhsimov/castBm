import java.math.*;

public class NumberBm {
	static byte p_b = 27;
	static Byte h_b = 55; 
	public static void main(String[] args) {
		System.out.println("Primitive byte: " + p_b);
		System.out.println("Helper byte: " + h_b);
		Double castedToDouble = new Double(h_b);
		System.out.println("Casted to Double: " + castedToDouble);
		System.out.println("variable: " + castedToDouble + " is " + castedToDouble.getClass().getSimpleName());
		
		byte castedTo_byte = castedToDouble.byteValue();
		System.out.println("Casted to byte: " + castedTo_byte);
				
		int castedTo_int = castedToDouble.intValue();
		System.out.println("Casted to int: " + castedTo_int);
		
		float castedTo_float = castedToDouble.floatValue();
		System.out.println("Casted to float: " + castedTo_float);
				
		String castedToString = h_b.toString();
		System.out.println("Casted to String: " + castedToString);
		System.out.println("variable: " + castedToString + " is " + castedToString.getClass().getSimpleName());
		
		Double d1 = 100500.84;
		String ds1 = Double.toString(d1);
		BigDecimal bigNumber = new BigDecimal(ds1);
		System.out.println(bigNumber);
		
		double d = 15.645;
		String ds = Double.toString(d);
		BigDecimal bd = new BigDecimal(ds);
		System.out.println(bd);
		
		System.out.println(bigNumber.multiply(bd));
		

	}

}
