public class Outer3 {
      private String s1= "John";

      public Object getInner(){
           String s2 = "Mary";
           final String s3 = "Gary"; 
           class Inner3 {
                  String s4 = "Amy";
                  public String toString() {
                        return "( " +
                                          s1 + ", "  +
                                    //    s2 + ", " +
                                          s3 + ", " +
                                          s4 + ") " ;
                  }
           }
           return new Inner3(); 
      }

}
