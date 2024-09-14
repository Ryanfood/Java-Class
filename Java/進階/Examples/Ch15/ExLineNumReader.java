import java.io.*;

public class ExLineNumReader {
	public static void main(String argv[]) {
		try {
			FileReader fin = new FileReader(argv[0]);
			LineNumberReader lnr = new LineNumberReader(fin);

			String str = lnr.readLine();
			while (str != null) {
				System.out.println(lnr.getLineNumber()+":"+str);
				str = lnr.readLine();
			}

			lnr.close();
			fin.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
