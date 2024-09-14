public class TestCheckedCallStack3 {
	public static void main(String[] args) {
		CheckedCallStack3 cs = new CheckedCallStack3();
		
		try{
			cs.a();
		} catch (java.io.IOException ioe){
			System.err.println(ioe);
		}
	}
}
