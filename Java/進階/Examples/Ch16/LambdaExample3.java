import java.util.ArrayList;

public class LambdaExample3{
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
          
        myList.add("Sean");
        myList.add("David");
        myList.add("Amy");
        myList.add("Nicole");
        myList.add("Al");

		myList.removeIf(s->s.equals("Amy"));		
        System.out.println(myList.toString());

		myList.removeIf(s->s.length()<3);	
        System.out.println(myList.toString());

	}
}
