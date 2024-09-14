import java.util.*;
import java.util.stream.Stream;
public class FilterDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		//for �j�魡�N�ާ@
		System.out.print("for �j�魡�N�ާ@:");
		for(int n: list) {
			if(n%2==0){
				System.out.print(" "+n);
			}
		}

		// ��y��k�v�B�ާ@
		System.out.print("\n��y��k�v�B�ާ@:");
		Stream<Integer> stream = list.stream(); //�ഫ����y����
		Stream<Integer> evenStream = stream.filter(n -> n%2==0); //�����ާ@:�L�o
		evenStream.forEach(n -> System.out.print(" "+n)); //�׺ݾާ@:forEach

	}
}
