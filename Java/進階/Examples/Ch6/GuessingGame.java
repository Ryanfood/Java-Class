public class GuessingGame{
	public static void main(String[] args){
		if(args.length==0 || args[0].equalsIgnoreCase("help)) {
			System.out.println("�{���Ϊk: java Guessing [1-5�Ʀr]");
		} else if(!args[0].matches("\\d")){
			System.out.println("�q�����e�ݬ��Ʀr");		
		} else {
			int guessing = Integer.parseInt(args[0]);
			if(guessing>5 || guessing<1){
				System.out.println("�q���Ʀr��1-5����");
			} else {
				int answer = (int)(Math.random()*5+1);
				if(answer==guessing)
					System.out.print("���߲q��F!");
				else
					System.out.print("�q���F!���׬O"+answer);
			}
		}
	}
}