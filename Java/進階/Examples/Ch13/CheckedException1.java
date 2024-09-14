public class CheckedException1 {
	public static void main(String[] args) {
		java.io.File testFile = new java.io.File("test.txt");
        testFile.createNewFile();

        System.out.println("File exists: " + testFile.exists());
        testFile.delete();
        System.out.println("File exists: " + testFile.exists());
	}
}
