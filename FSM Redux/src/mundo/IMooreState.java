package mundo;

public interface IMooreState {
	
	public void createState() throws Exception;

	public String getName();
	
	public void setName(String name);
	
	public char getOutput();
	
	public IMooreTransition getTransitions();
	
}
