public class TestInteger {
	public static void main(String[] args){
		Integer i1 = new Integer(200);
		Integer i2 = new Integer("200");
		Integer i3 = Integer.valueOf(200);
		Integer i4 = Integer.valueOf("200");
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println(i1.equals(i2)); 
		System.out.println(i3.equals(i4));
	}
}
