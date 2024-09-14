public class RethrowTest {

	public void rethrowException(String exceptionName) throws FirstException, SecondException{ 
		try { 
			if (exceptionName.equals("First")) { 
				  throw new FirstException(); 
			} else { 
				  throw new SecondException(); 
			}
		} catch (Exception e) { 
				  throw e;  
		}
	}
}

class FirstException extends Exception { 
      // ... 
}

class SecondException extends Exception { 
      // ... 
}
