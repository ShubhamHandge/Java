package Course_ToDo6;

public class ProviderNotFoundException extends Exception{

	private String invalidName;

	public ProviderNotFoundException(	 String errorMessage,String invalidName) {
		super(errorMessage);
		this.invalidName = invalidName;
	}
	@Override
	public String getMessage(){
		String message = super.getMessage();
		String finalMessage = message + ": " + invalidName;
		return finalMessage;
	}

}
