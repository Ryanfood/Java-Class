import java.io.*;
public class ExFile1{  
	public static void main(String[] args) {
		File f = new File("Test.txt");
		System.out.println("�ɮ׬O�_�s�b�H" + f.exists());

		if (!f.exists()) {
			try {
				System.out.print("createNewFile() �إ߷s�ɮסH");
				System.out.println(f.createNewFile());
			} catch (IOException e) {
				System.out.println(e);
			}

			System.out.println("�ˬd�s���ɮ׬O�_�s�H" + f.exists());
		}	
	}
}
