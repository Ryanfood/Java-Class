public class TestArrayCopy {
	public static void main(String[] args) {
		int[] x = {1,2,3};
		System.out.print("°}¦CX:");
		for(int i=0; i<x.length; i++){
			System.out.print(x[i]+", ");
		}
		System.out.println();

		int[] y = new int[6];
		System.arraycopy(x, 0, y, 2, 3);
		System.out.print("°}¦CY:");
		for(int a : y){
			System.out.print(a+", ");
		}
		System.out.println();

		int[] z = java.util.Arrays.copyOfRange(y, 2, 5);
		System.out.print("°}¦CZ:");
		for(var b : z){
			System.out.print(b+", ");
		}

	}
}
