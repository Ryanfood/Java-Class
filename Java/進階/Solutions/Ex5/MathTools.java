public class MathTools {
	public static double getHypotenuse(double bottom, double height){
		return Math.sqrt(bottom*bottom+Math.pow(height,2));
	}
	
	public static boolean isPrime(int num){
		for(int i=2; i<num; i++)
			if(num%i==0)
				return false;
		return true;		
	}
	
	public static double getFarenheit(double celsuis){
		return 9*celsuis/5+32;
	}
	
	public static double getBMI(int height, int weight){
		double h = height/100.0;
		return weight/Math.pow(h,2);
	}
	
	public static void main(String[] args){
		System.out.println("����3,����4�������T����,�������"+getHypotenuse(3,4));
		System.out.println("����5,����12�������T����,�������"+getHypotenuse(5,12));
		System.out.println("87"+(isPrime(87)?"�O���":"���O���"));
		System.out.println("89"+(isPrime(89)?"�O���":"���O���"));
		for(int i=0; i<=100; i+=10)
			System.out.println("���"+i+"�׵���ؤ�"+(int)getFarenheit(i)+"��");
		System.out.println("����178����,�魫80����,BMI��"+getBMI(178, 80));
	}
}