public class EnumForEachExample {
	public enum TrafficSignal {STOP, CAUTION, GO}

	public static void main(String[] args) {
		for(TrafficSignal  t : TrafficSignal.values()){
			System.out.println(t);
		}
	}
}
