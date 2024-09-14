import java.io.*;
public class FinallyExampleMain {
	public static void main(String[] args) {
		/*FileReader in = null;
		try {
			  in = new FileReader("missingfile.txt");*/
		try(FileReader in = new FileReader("missingfile.txt")){
			  System.out.println("File open");
			  int data = in.read();
		} catch (FileNotFoundException e) {
			  System.out.println(e.getMessage());
		} catch (IOException e) {
			  System.out.println(e.getMessage());
		}/* finally {
			try {
				  if (in != null) {    in.close();     } 
			} catch (IOException e) {
				  System.out.println("Failed to close file");
			}
		}*/
	}
}
