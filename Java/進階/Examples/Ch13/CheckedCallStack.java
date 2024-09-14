public class CheckedCallStack {
	public void a(){
		b();
	}
	
	public void b() {
		try{
			java.io.File testFile = new java.io.File("test.txt");
	        testFile.createNewFile();

		    System.out.println("File exists: " + testFile.exists());
			testFile.delete();
			System.out.println("File exists: " + testFile.exists());
		} catch (java.io.IOException ioe){
			System.err.println(ioe);
		}
	}
}
