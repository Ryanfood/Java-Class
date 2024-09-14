public class MyResource implements AutoCloseable{ 
      @Override
      public void close() throws Exception {
            System.out.println("關閉資源");
            throw new Exception("關閉資源發生錯誤!");
      }
}
