import java.util.Date;

public class VariableExampleClass {
	public static final int JAVA_CONSTANT;
	private final int field;
	private final int forgottenField;
	private final Date date = new Date();

	static {  
		JAVA_CONSTANT = 10; // allowed 
	}

	public VariableExampleClass() {
		field = 100;  // allowed
		// compile time error, variable forgottenField might not have been initialized
	}

	public void changeValues(final int param) {
		param = 1; // compile time error

		final int localVar;
		localVar = 42; // allowed
		localVar = 43; // compile time error

		date.setTime(0); // allowed
		date = new Date(); // compile time error
	}
}
