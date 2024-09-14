public class Outer1 {
      private int size;

      public int getSize() {
    	       return size;
      }

      public class Inner1 {
            public void incrSize() {
                  size++;
            }
      }

      public void doSomething(){
            Inner1 i = new Inner1();
            i.incrSize();
      }

}
