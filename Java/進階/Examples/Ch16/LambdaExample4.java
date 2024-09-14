import java.util.ArrayList;

public class LambdaExample4{
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
          
        myList.add("Sean");
        myList.add("David");
        myList.add("Amy");
        myList.add("Nicole");
        myList.add("Al");

        myList.replaceAll(s->s.toUpperCase());		
        System.out.println(myList.toString());

        myList.replaceAll(s->s.toLowerCase());	
        System.out.println(myList.toString());

	}
}
