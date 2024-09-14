public class SuppressedExample1 {
      public static void main(String[] args) {
            try {
                  doSomething();
            } catch (Exception e) {
                  System.out.println(e);
            }
      }
      public static void doSomething() throws Exception {
            try (MyResource mr = new MyResource()) {
                  System.out.println("Do something...");
                   throw new Exception("Do something µo¥Í¿ù»~!");
            }
      }
}
