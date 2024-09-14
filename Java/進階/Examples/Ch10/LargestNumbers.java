import java.math.*;
public class LargestNumbers {
    public static void main(String[ ] args) {
        Number[ ] nums = new Number[4];
        nums[0] = new Integer(45); // Add an integer
        nums[1] = new Double(3445.53); // Add a double    
        nums[2] = new BigInteger("3432323234344343101"); // Add a BigInteger    
        nums[3] = new BigDecimal("2090909098909134343334434.3"); // Add a BigDecimal
        System.out.println("The largest number is " + getLargestNumber(nums));
    }
  
    public static Number getLargestNumber(Number[ ] list) {
        if (list == null || list.length == 0) 
            return null;
        Number largestNum = list[0];
        for (int i=1; i < list.length; i++)
            if (largestNum.doubleValue( ) < list[i].doubleValue( )) 
                largestNum = list[i];
        return largestNum;
    }
}
