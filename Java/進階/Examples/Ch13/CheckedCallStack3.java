public class CheckedCallStack3 {
	public void a() throws java.io.IOException{
		b();
	}
	
	public void b() throws java.io.IOException{
		java.io.File testFile = new java.io.File("test.txt");
		testFile.createNewFile();

		System.out.println("File exists: " + testFile.exists());
		testFile.delete();
		System.out.println("File exists: " + testFile.exists());

	}
}
