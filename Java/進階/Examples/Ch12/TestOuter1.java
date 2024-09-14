public class TestOuter1 {
      
      public static void main(String[] args){
            Outer1 o = new Outer1();
            o.doSomething();
            System.out.println(o.getSize());
            
            Outer1.Inner1 oi = o.new Inner1();
            oi.incrSize();
            System.out.println(o.getSize());
      }

}
