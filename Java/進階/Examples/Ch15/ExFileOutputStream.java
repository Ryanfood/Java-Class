import java.io.*;
public class ExFileOutputStream {
	public static void main(String[] args) {
		String s = "Java ��J�P��X ( java.io �禡�w )";
		byte[] data = s.getBytes();
		System.out.println("�N�r��\"" + s + "\"�g���ɮ�");
		System.out.println("��ƪ��סG" + data.length + " bytes.");

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("outputFile.txt", true);
			fos.write(data); //�����N byte[] �g�J�ɮ�
		} catch(IOException e){
		} finally {
			try {
				fos.close(); // �����ɮ�
			} catch(IOException e){}
		}
	}
}
