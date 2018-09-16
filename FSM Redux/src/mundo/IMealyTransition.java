package mundo;

public interface IMealyTransition {
	
	public char getInput();
	
	public char getOutput();
	
	public IMealyState getDestinationStateMealy();

}
