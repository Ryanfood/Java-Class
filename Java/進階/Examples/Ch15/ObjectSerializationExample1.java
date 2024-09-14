import java.io.*;
public class ObjectSerializationExample1 {
	public static void main(String argv[]) {
		int c = Integer.parseInt(argv[1]);
		int e = Integer.parseInt(argv[2]);
		int m = Integer.parseInt(argv[3]);
		Student st = new Student(argv[0], c, e, m);
		st.printData();		
		try {
			FileOutputStream fout = new FileOutputStream("Student.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(fout);

			objOut.writeObject(st);
			objOut.close();
			fout.close();
		} catch (IOException ie) {
			System.err.println(e);
		}
	}
}
