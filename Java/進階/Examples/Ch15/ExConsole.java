import java.util.*;
import java.io.*;

public class ExConsole{
	public static void main(String[] args) {
		Console console = System.console();
		String userName = console.readLine("%s", "�п�J�b��:");
		char[] password = console.readPassword("%s", "�п�J�K�X:");
		console.printf("�b��: %S; �K�X: %s%n", 
		       userName, String.valueOf(password));

		Date date = new Date();
		console.printf("�{�b�ɶ�: %tF %<tT%n", date);

		console.printf("��P�v: %.2f %n", Math.PI);
	}
}
