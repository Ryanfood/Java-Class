import java.util.function.DoubleFunction;

public class DoubleFunctionDemo {
    public static void main(String[] args) {
		// �ϥ�Lambda Expression
        DoubleFunction<String> area = r -> "�ꭱ�n��" + r*r*3.14159;
		// �ϥ� anonymous inner class	
        /*DoubleFunction<String> area = new DoubleFunction<String>() {
            public String apply(double v) {
                return "�ꭱ�n��"+(v*v*3.14159);
            }
        };*/

        String result = area.apply(10);
        System.out.println(result);
    }
}
