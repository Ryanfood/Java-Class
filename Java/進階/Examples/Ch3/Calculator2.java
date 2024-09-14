public class Calculator2 {
	public int sum(int... c) {
        int s = 0;
        for(int i:c) {
            s += i;
        }
        return s;
    }

}
