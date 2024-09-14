import java.util.*;
import java.io.*;

public class ExConsole{
	public static void main(String[] args) {
		Console console = System.console();
		String userName = console.readLine("%s", "請輸入帳號:");
		char[] password = console.readPassword("%s", "請輸入密碼:");
		console.printf("帳號: %S; 密碼: %s%n", 
		       userName, String.valueOf(password));

		Date date = new Date();
		console.printf("現在時間: %tF %<tT%n", date);

		console.printf("圓周率: %.2f %n", Math.PI);
	}
}
