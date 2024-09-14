public class EnumSwitchExample {
	public enum TrafficSignal {STOP, CAUTION, GO}
	public static void main(String[] args) {
		TrafficSignal theLight = TrafficSignal.GO;
		switch (theLight){
			case STOP:
				System.out.println("Red");
				break;
			case CAUTION:
				System.out.println("Yellow");
				break;
			case GO:
				System.out.println("Green");
				break;
		}
	}
}
