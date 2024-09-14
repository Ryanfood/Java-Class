public class TestOuter3 {
      
      public static void main(String[] args){
            Outer3 o = new Outer3();
            Object obj = o.getInner();
            System.out.println(obj.toString());
      }

}
