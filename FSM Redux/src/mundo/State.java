package mundo;

import java.util.ArrayList;

public class State implements IMealyState, IMooreState {
	
	private ArrayList<Transition> transitions;

	public State() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getOutput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IMooreTransition getTransitions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public IMealyTransition getTransition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createState() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
