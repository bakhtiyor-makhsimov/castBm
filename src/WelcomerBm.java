import java.util.Date;

public class WelcomerBm {
	
	private static String welcome = "hello";
	private char[] chars = {'I','a','m','A','r','r','a','y'};
	private Date date = new Date();
	
	public void sayHello() {
		System.out.println(welcome);
	}
	public void callArray() {
		System.out.println(chars);
	}
	public void callDate() {
		System.out.println(date);
	}

}
