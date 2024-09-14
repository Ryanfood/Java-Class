public class Calculator2Test {

	public static void main(String [] args) {     
		Calculator2 calc = new Calculator2();

        int a = calc.sum(1, 2);
        int b = calc.sum(1, 2, 3, 4);
        int c = calc.sum(a, b);
        System.out.println(c);

	}
}
