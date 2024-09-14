import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class MethodChainDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		// 串流方法鏈接操作
		System.out.print("\n串流方法鏈接操作:");
		list.stream().filter(n -> n%2==0).forEach(n -> System.out.print(" "+n));

		// 將Lambda 表示式宣告為物件變數進行鏈接呼叫
		System.out.print("\n物件變數鏈接呼叫:");
		Predicate<Integer> criteria = n -> n%2==0;
		Consumer<Integer> action = n -> System.out.print(" "+n);
		list.stream().filter(criteria).forEach(action);

	}
}
