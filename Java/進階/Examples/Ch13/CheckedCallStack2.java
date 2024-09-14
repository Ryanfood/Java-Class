public class CheckedCallStack2 {
	public void a(){
		try{
			b();
		} catch (java.io.IOException ioe){
			System.err.println(ioe);
		}
	}
	
	public void b() throws java.io.IOException{

		java.io.File testFile = new java.io.File("test.txt");
		testFile.createNewFile();

		System.out.println("File exists: " + testFile.exists());
		testFile.delete();
		System.out.println("File exists: " + testFile.exists());

	}
}
