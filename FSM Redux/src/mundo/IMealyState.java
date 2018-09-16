package mundo;

public interface IMealyState {
	
	public void createState() throws Exception;
	
	public String getName();
	
	public void setName(String name);
	
	public IMealyTransition getTransition();

}
