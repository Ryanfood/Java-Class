import java.io.*;
public class ExFile1{  
	public static void main(String[] args) {
		File f = new File("Test.txt");
		System.out.println("檔案是否存在？" + f.exists());

		if (!f.exists()) {
			try {
				System.out.print("createNewFile() 建立新檔案？");
				System.out.println(f.createNewFile());
			} catch (IOException e) {
				System.out.println(e);
			}

			System.out.println("檢查新建檔案是否存？" + f.exists());
		}	
	}
}
