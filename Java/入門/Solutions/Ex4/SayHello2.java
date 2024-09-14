public class SayHello2 {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("輸入姓名:");
		String name = sc.nextLine();
		System.out.println(name+"你好!");
	}
}