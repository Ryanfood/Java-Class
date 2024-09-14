public class GreenColorAnalyzer implements ShirtAnalyzer {
	@Override
	public boolean analyze(Shirt shirt) {
		return shirt.getColorCode()=='G';
	}
}
