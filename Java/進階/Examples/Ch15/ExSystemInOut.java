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
				System.out.print("請輸入一個字串(輸入quit離開):");
				s = br.readLine();		
				System.out.println("您所輸入的字串是 = " + s);
			} while (!(s.equals("quit")));
		} catch(IOException e) {
		} finally {
			try {    
				br.close();
			} catch(IOException e){}
		}
	}
}