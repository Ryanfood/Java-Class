import java.io.*;

public class ObjectSerializationExample2 {
	public static void main(String argv[]) {
		try {
			FileInputStream fin = new FileInputStream("Student.ser");
			ObjectInputStream objIn = new ObjectInputStream(fin);

			Student st = (Student)objIn.readObject();
			st.printData();

			objIn.close();
			fin.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
