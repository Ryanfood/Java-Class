public enum TrafficSignal {
	STOP ("red") , CAUTION("yellow"), GO("green");
	private final String light;
    private TrafficSignal(String t){
		light = t;
	}	
    public String format(String message){
		return message + " " + light;
	}	
}
