public class MyResource implements AutoCloseable{ 
      @Override
      public void close() throws Exception {
            System.out.println("�����귽");
            throw new Exception("�����귽�o�Ϳ��~!");
      }
}
