public class ThrowError {
    
    public static void main (String args[]) {
		java.util.ArrayList theList = new java.util.ArrayList();
        while(true) {
			String theString = "A test String";
			theList.add(theString);

			if (theList.size()% 1000000 == 0) {
				System.out.println("List now has " + theList.size()/1000000 + " million elements!");
			}
		}
	}
}