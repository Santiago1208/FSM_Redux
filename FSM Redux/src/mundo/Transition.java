package mundo;

import java.util.ArrayList;

public class Transition implements IMealyTransition, IMooreTransition {
	
	private ArrayList<State> states;

	public Transition() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char getOutput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IMooreState getDestinationStateMoore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMealyState getDestinationStateMealy() {
		// TODO Auto-generated method stub
		return null;
	}

}
