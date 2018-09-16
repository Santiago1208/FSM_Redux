package mundo;

public interface IMealyState {
	
	public void addTransition(IMealyTransition transition);
	
	public String getName();
	
	public void setName(String name);
	
	public IMealyTransition getTransition();

}
