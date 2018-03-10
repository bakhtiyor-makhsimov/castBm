import java.util.Date;

public class Welcomer {
	String welcomer = "Hello!";
	int number = 12345;
	char[] chars = {'w','o','r','l','d'};
	String chars1 = new String(chars);
	Date date = new Date();
	
	public void callWelcome() {
		System.out.println(welcomer + ' ' + chars1 + ' ' + number + ' ' + date);
	}

}
