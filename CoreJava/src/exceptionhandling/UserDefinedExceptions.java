package exceptionhandling;

public class UserDefinedExceptions {

	public static void main(String[] args) throws LoginException{
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException a) {
			throw new LoginException("Login is Failed please try ");
		}

	}

}


