import java.io.*;
public class ExFileWriter {
	public static void main(String[] args) throws Exception {
		String data = "Java 輸入與輸出 ( java.io 函式庫 )";
		System.out.println("將字串\"" + data + "\"寫到檔案");
		System.out.println("資料長度：" + data.length() + " 個字");
		FileWriter fw = null;
		try {
			fw = new FileWriter("outputFile2.txt");
			fw.write(data); //直接將 String 寫入檔案
		} catch(IOException e) {
		} finally {
			try {
				fw.close(); // 關閉檔案
			} catch(IOException e) {}
		}
	}
}
