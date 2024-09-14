import java.io.*;

public class ExFileReader {
	public static void main(String argv[]) {
		try {
			FileReader fin = new FileReader(argv[0]);
			int i = fin.read();
			while (i != -1) {
				System.out.print((char)i);
				i = fin.read();
			}			
			fin.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
