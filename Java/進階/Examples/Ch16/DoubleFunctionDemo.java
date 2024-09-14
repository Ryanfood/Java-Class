import java.util.function.DoubleFunction;

public class DoubleFunctionDemo {
    public static void main(String[] args) {
		// 使用Lambda Expression
        DoubleFunction<String> area = r -> "圓面積為" + r*r*3.14159;
		// 使用 anonymous inner class	
        /*DoubleFunction<String> area = new DoubleFunction<String>() {
            public String apply(double v) {
                return "圓面積為"+(v*v*3.14159);
            }
        };*/

        String result = area.apply(10);
        System.out.println(result);
    }
}
