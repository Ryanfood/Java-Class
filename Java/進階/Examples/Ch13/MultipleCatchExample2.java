import java.io.*;
public class MultipleCatchExample2 {
	public static void main(String[] args) {
		try (InputStream in= new FileInputStream("test.txt") ){			
			int i = in.read();			
			while (i != -1) {
				System.out.print((char)i);
				i = in.read();
			}
		//} catch (FileNotFoundException | IOException e) {
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
