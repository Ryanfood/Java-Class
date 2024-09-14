import java.util.*;
public class GenericsExample4 {
	public static void main(String[] args) {
		List<Integer> data1 = new LinkedList<Integer>();
		data1.add(1);
		data1.add(2);
		sum(data1);

		List<Double> data2 = new LinkedList<Double>(); 			
		data2.add(5.3);
		data2.add(7.6);
		sum(data2);
	}
	
	public static void sum(List<? extends Number> data) {
		double sum = 0.0;
		for(int i=0; i<data.size(); i++){
			Number num = data.get(i);
			sum += num.doubleValue();
		}
		
		System.out.println("SUM = " + sum);
	}
}
