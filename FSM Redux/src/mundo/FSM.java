package mundo;

import java.util.HashMap;

public class FSM {
	
	private boolean type;
	
	private int inputCapacity;
	
	private char[] inputAlphabet;
	
	private int outputCapacity;
	
	private char[] outputAlphabet;

	private HashMap<String, State> states;

	public FSM(boolean type, int inputCapacity, int outputCapacity) {
		super();
		this.type = type;
		this.inputCapacity = inputCapacity;
		this.outputCapacity = outputCapacity;
	}
	
	public void createState(boolean type) {
		
	}

	public int getInputCapacity() {
		return inputCapacity;
	}

	public void setInputCapacity(int inputCapacity) {
		this.inputCapacity = inputCapacity;
	}

	public char[] getInputAlphabet() {
		return inputAlphabet;
	}

	public void setInputAlphabet(char[] inputAlphabet) {
		this.inputAlphabet = inputAlphabet;
	}

	public int getOutputCapacity() {
		return outputCapacity;
	}

	public void setOutputCapacity(int outputCapacity) {
		this.outputCapacity = outputCapacity;
	}

	public char[] getOutputAlphabet() {
		return outputAlphabet;
	}

	public void setOutputAlphabet(char[] outputAlphabet) {
		this.outputAlphabet = outputAlphabet;
	}

	

}
