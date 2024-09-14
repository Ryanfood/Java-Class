import java.io.*;
public class ExFile2 {
	public static void main(String[] args) {
		String path = args[0];
		File f1 = new File(path);
		String[] fileList = f1.list();
		for(int i=0;i<fileList.length;i++) {
			File f2 = new File(f1, fileList[i]);
			if (f2.isDirectory())
				System.out.println(fileList[i] + " : 是目錄.");
			else
				System.out.println(fileList[i] + " : 是檔案.");
		}
	}
}
