public class AddArguments{
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<4; i++){
			sum += Integer.parseInt(args[i]);
        }
        System.out.println("sum = " + sum);
    }
}
