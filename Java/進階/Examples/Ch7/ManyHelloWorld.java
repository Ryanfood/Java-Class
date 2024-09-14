import static java.lang.Integer.*;
import static java.lang.System.out;

public class ManyHelloWorld {
    public static void main(String[ ] args) {
        int number = Integer.parseInt(args[0]);
        for (int i=0; i<number; i++)
             System.out.println("Hello! World!");
    }
} 
