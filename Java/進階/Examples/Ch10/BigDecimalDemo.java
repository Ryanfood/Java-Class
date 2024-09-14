import java.math.BigDecimal;
public class BigDecimalDemo {
	public static void main(String[] args) {
		var a = 0.1;
		var b = 0.1;
		var c = 0.1;
		if((a+b+c) == 0.3)
			System.out.println("a+b+c == 0.3");
		else			
			System.out.println("a+b+c != 0.3");
		
        var x = new BigDecimal("0.1");
        var y = new BigDecimal("0.1");
        var z = new BigDecimal("0.1");
        var r = new BigDecimal("0.3");
        
        if(x.add(y).add(z).equals(r))
            System.out.println("x+y+z 等於 "+r.doubleValue());
        else 
            System.out.println("x+y+z 不等於 "+r.doubleValue());

	}
}
