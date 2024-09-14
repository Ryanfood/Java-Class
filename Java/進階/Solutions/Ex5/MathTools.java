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
		System.out.println("底為3,高為4的直角三角形,斜邊長為"+getHypotenuse(3,4));
		System.out.println("底為5,高為12的直角三角形,斜邊長為"+getHypotenuse(5,12));
		System.out.println("87"+(isPrime(87)?"是質數":"不是質數"));
		System.out.println("89"+(isPrime(89)?"是質數":"不是質數"));
		for(int i=0; i<=100; i+=10)
			System.out.println("攝氏"+i+"度等於華氏"+(int)getFarenheit(i)+"度");
		System.out.println("身高178公分,體重80公斤,BMI為"+getBMI(178, 80));
	}
}