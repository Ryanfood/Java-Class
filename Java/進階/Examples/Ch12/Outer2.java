public class Outer2 {
      private static int size;
      
      public static int getSize() {
    	       return size;
      }

      public static class Inner2 {
            public void incrSize() {
                  size++;
            }
      }
}
