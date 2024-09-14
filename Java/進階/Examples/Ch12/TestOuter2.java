public class TestOuter2 {
      
      public static void main(String[] args){
            Outer2.Inner2 oi = new Outer2.Inner2();
            oi.incrSize();
            System.out.println(Outer2.getSize());
      }

}
