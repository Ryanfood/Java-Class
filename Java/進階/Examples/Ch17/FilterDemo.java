import java.util.*;
import java.util.stream.Stream;
public class FilterDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		//for 迴圈迭代操作
		System.out.print("for 迴圈迭代操作:");
		for(int n: list) {
			if(n%2==0){
				System.out.print(" "+n);
			}
		}

		// 串流方法逐步操作
		System.out.print("\n串流方法逐步操作:");
		Stream<Integer> stream = list.stream(); //轉換為串流物件
		Stream<Integer> evenStream = stream.filter(n -> n%2==0); //中間操作:過濾
		evenStream.forEach(n -> System.out.print(" "+n)); //終端操作:forEach

	}
}
