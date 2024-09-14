import java.io.*;

public class ExFileInputStream1 {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream(args[0]);

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
