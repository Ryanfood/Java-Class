public class Programer1 {

      private Brain myBrain = new MyBrain();

      private class MyBrain extends Brain{
            public void think(){
                  System.out.println("Java!");
            }
      }
}

abstract class Brain {
	abstract void think();
}
