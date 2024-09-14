import java.io.*;

public class ExFileInputStream2 {
	public static void main(String argv[]) {
		try {
			FileInputStream fin = new FileInputStream(argv[0]);

			byte buf[] = new byte[16];

			int i = fin.read(buf);
			while (i > 0) {
				System.out.print(new String(buf, 0, i));
				i = fin.read(buf);
			}
			fin.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
