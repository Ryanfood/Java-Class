import java.io.*;
import java.util.*;
public class MultipleResource {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��J��ƨӷ���:");
		String src = sc.next();
		System.out.print("��J�ƻs�ؼ���:");
		String dest = sc.next();
		try (BufferedReader in = new BufferedReader(new FileReader(src));
			   PrintWriter out = new PrintWriter(new FileWriter(dest))) {

			  String line;
			  while((line = in.readLine()) != null) {
					out.println(line);
			  }
		} catch(IOException e){
			  System.out.println(e.getMessage());
		}// No need to close resources in a "finally"
	}
}
