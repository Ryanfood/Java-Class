import java.util.*;
import java.util.function.Consumer;
public class ForEachDemo {
	public static void main(String[] args) {
		//for �j�魡�N�ާ@
		System.out.print("for �j�魡�N�ާ@:");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for(Integer n: list) {
			System.out.print(" "+n); 
		}

		//�ΦW���O�i��forEach()��y�ާ@
		System.out.print("\n�ΦW���O��y�ާ@:");
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer n) {
				System.out.print(" "+n);
			}
		});

		// Lambda Express�i��forEach()��y�ާ@
		System.out.print("\nLambda ��y�ާ@:");
		list.forEach(n -> System.out.print(" "+n));

	}
}
