import java.io.*;
public class ExFileWriter {
	public static void main(String[] args) throws Exception {
		String data = "Java ��J�P��X ( java.io �禡�w )";
		System.out.println("�N�r��\"" + data + "\"�g���ɮ�");
		System.out.println("��ƪ��סG" + data.length() + " �Ӧr");
		FileWriter fw = null;
		try {
			fw = new FileWriter("outputFile2.txt");
			fw.write(data); //�����N String �g�J�ɮ�
		} catch(IOException e) {
		} finally {
			try {
				fw.close(); // �����ɮ�
			} catch(IOException e) {}
		}
	}
}
