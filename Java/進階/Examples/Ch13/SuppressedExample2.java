public class SuppressedExample2 {
	public static void main(String[] args) {
		try {
			doSomething();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("被壓制的例外: ");
			Throwable[] th = e.getSuppressed();
			for(Throwable t : th)
				System.out.println(t);
		}
	}
	public static void doSomething() throws Exception {
		try (MyResource mr = new MyResource()) {
			System.out.println("Do something...");
			throw new Exception("Do something 發生錯誤!");
		}
	}
}
