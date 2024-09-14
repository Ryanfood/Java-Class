public class MSizeAnalyzer implements ShirtAnalyzer {
	@Override
	public boolean analyze(Shirt shirt) {
		return shirt.getSize().equals("M");
	}
}
