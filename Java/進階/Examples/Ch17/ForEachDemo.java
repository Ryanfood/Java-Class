import java.util.*;
import java.util.function.Consumer;
public class ForEachDemo {
	public static void main(String[] args) {
		//for 迴圈迭代操作
		System.out.print("for 迴圈迭代操作:");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for(Integer n: list) {
			System.out.print(" "+n); 
		}

		//匿名類別進行forEach()串流操作
		System.out.print("\n匿名類別串流操作:");
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer n) {
				System.out.print(" "+n);
			}
		});

		// Lambda Express進行forEach()串流操作
		System.out.print("\nLambda 串流操作:");
		list.forEach(n -> System.out.print(" "+n));

	}
}
