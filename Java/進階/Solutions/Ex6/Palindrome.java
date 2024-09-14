public class Palindrome {

	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("輸入文字: ");
		String str = sc.nextLine();
		boolean result = isPalindrome(str);
		if(result)
			System.out.println(str+"是迴文");
		else
			System.out.println(str+"不是迴文");
		
	}
	
	public static boolean isPalindrome(String test){
		test = test.toLowerCase();
		int low=0, high=test.length()-1;
		while(low<high) {
			if(test.charAt(low)!=test.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
	
}