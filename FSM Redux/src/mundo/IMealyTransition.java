package mundo;

public interface IMealyTransition {
	
	public void setOutput(char output);
	
	public char getOutput();
	
	public IMealyState getDestinationStateMealy();

}
