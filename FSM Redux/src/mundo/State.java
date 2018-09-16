package mundo;

import java.util.ArrayList;

import excepciones.MealyTransitionException;
import excepciones.MooreTransitionException;
import excepciones.TransitionException;

public class State implements IMealyState, IMooreState {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el nombre del estado
	 */
	private String name;
	
	/**
	 * Representa el símbolo de salida del estado
	 */
	private char outputSymbol;
	
	/**
	 * Representa las transiciones que pueden haber desde el estado
	 */
	private ArrayList<Transition> transitions;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------

	public State(String name) {
		this.name = name;
		transitions = new ArrayList<>();
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
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

	@Override
	public void addTransition(IMealyTransition transition) {
		transitions.add((Transition) transition);
	}

}
