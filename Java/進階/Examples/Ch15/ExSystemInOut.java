import java.io.*;
public class ExSystemInOut {
	public static void main(String[] args) {
		InputStreamReader in = null;
		BufferedReader br = null;
		try {
			in = new InputStreamReader(System.in);
			br = new BufferedReader(in); 
			String s;
			do {				
				System.out.print("�п�J�@�Ӧr��(��Jquit���}):");
				s = br.readLine();		
				System.out.println("�z�ҿ�J���r��O = " + s);
			} while (!(s.equals("quit")));
		} catch(IOException e) {
		} finally {
			try {    
				br.close();
			} catch(IOException e){}
		}
	}
}