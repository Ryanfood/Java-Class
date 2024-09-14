public class GuessingGame{
	public static void main(String[] args){
		if(args.length==0 || args[0].equalsIgnoreCase("help)) {
			System.out.println("程式用法: java Guessing [1-5數字]");
		} else if(!args[0].matches("\\d")){
			System.out.println("猜測內容需為數字");		
		} else {
			int guessing = Integer.parseInt(args[0]);
			if(guessing>5 || guessing<1){
				System.out.println("猜測數字需1-5之間");
			} else {
				int answer = (int)(Math.random()*5+1);
				if(answer==guessing)
					System.out.print("恭喜猜對了!");
				else
					System.out.print("猜錯了!答案是"+answer);
			}
		}
	}
}