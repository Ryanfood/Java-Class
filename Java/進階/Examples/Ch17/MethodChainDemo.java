import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class MethodChainDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		// ��y��k�챵�ާ@
		System.out.print("\n��y��k�챵�ާ@:");
		list.stream().filter(n -> n%2==0).forEach(n -> System.out.print(" "+n));

		// �NLambda ��ܦ��ŧi�������ܼƶi���챵�I�s
		System.out.print("\n�����ܼ��챵�I�s:");
		Predicate<Integer> criteria = n -> n%2==0;
		Consumer<Integer> action = n -> System.out.print(" "+n);
		list.stream().filter(criteria).forEach(action);

	}
}
