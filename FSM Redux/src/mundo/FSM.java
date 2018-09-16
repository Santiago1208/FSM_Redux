package mundo;

import java.util.HashMap;

import excepciones.AlphabetException;
import excepciones.MachineException;
import excepciones.MealyTransitionException;
import excepciones.MooreTransitionException;
import excepciones.StateException;
import excepciones.TransitionException;

public class FSM {
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa una máquina tipo Mealy
	 */
	public final static boolean MEALY_TYPE = true;
	
	/**
	 * Representa una máquina tipo Moore
	 */
	public final static boolean MOORE_TYPE = false;
	
	/**
	 * Representa la longitud de los símbolos de los alfabetos de
	 * la máquina y de los nombres de los estados
	 */
	public final static int LENGTH_ALPHABET_SYMBOLS = 1;
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el tipo de la máquina. True es Mealy, false es Moore
	 */
	private boolean type;
	
	/**
	 * Representa el conjunto de simbolos de entrada de la máquina
	 */
	private char[] inputAlphabet;
	
	/**
	 * Representa el conjunto de simbolos de salida de la máquina
	 */
	private char[] outputAlphabet;

	/**
	 * Representa el conjunto de estados de la máquina
	 */
	private HashMap<String, State> states;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------

	
	public FSM(boolean type, String rawInputAlphabet, String rawOutputAlphabet, 
			String rawStates, String[][] transitionFunction) throws MachineException {
		this.type = type;
		inputAlphabet = buildAlphabetSet(rawInputAlphabet);
		outputAlphabet = buildAlphabetSet(rawOutputAlphabet);
		states = buildStateSet(rawStates);
		
		
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------	
	
	/**
	 * Método que se encarga de verificar que los símbolos del alfabeto solo
	 * tengan un caracter.
	 * @param rawAlphabet - Es la cadena que contiene a los símbolos del alfabeto separados por
	 * espacios.
	 * @return Un arreglo de caracteres con los símbolos de la máquina
	 * @throws AlphabetException Si alguno de los símbolos de la cadena tiene longitud mayor que 1
	 */
	private char[] buildAlphabetSet(String rawAlphabet) throws AlphabetException {
		String[] split = rawAlphabet.split(" ");
		char[] builtAlphabet = new char[split.length];
		for (int i = 0; i < split.length; i++) {
			String currentSymbol = split[i];
			if (currentSymbol.length() > FSM.LENGTH_ALPHABET_SYMBOLS) {
				throw new AlphabetException("Símbolo no aceptable por la máquina: " + currentSymbol);
			}
			char convertedSymbol = currentSymbol.charAt(0);
			builtAlphabet[i] = convertedSymbol;
		}
		return builtAlphabet;
	}
	
	/**
	 * Método que se encarga de crear el conjunto de estados a partir de una cadena de
	 * caracteres separados por espacios
	 * @param rawStates - Es la cadena de caracteres que contiene los estados separados por espacios
	 * @return Un Map con los estados recuperados de la cadena de caracteres
	 * @throws StateException - Si el nombre de algún estado excede de 1 caracter
	 */
	private HashMap<String, State> buildStateSet(String rawStates) throws StateException {
		HashMap<String, State> states = new HashMap<>();
		String[] split = rawStates.split(" ");
		for (int i = 0; i < split.length; i++) {
			String currentState = split[i];
			if (currentState.length() > LENGTH_ALPHABET_SYMBOLS) {
				throw new StateException("Estado no aceptable por la máquina: " + currentState);
			}
			State newState = new State(currentState);
			states.put(currentState, newState);
		}
		return states;
	}
	
	/**
	 * @param typeMachine
	 * @param rawTransitions
	 * @throws TransitionException
	 */
	public String[][] buildTransitions(boolean typeMachine, String[][] rawTransitions) 
			throws TransitionException {
		if (rawTransitions.length != states.size() + 1) {
			throw new TransitionException("A algún estado no se le definieron transiciones");
		}
		if (typeMachine == FSM.MEALY_TYPE) {
			buildMealyTransitions(rawTransitions);
		} else {
			buildMooreTransitions(rawTransitions);
		}
		return null;
	}
	
	/**
	 * Método que se encarga de construir las transiciones de una máquina de Mealy a partir
	 * de una matriz.
	 * @param rawTransitions - Son las transiciones que se crearán. Están en forma de matriz.
	 * @throws MealyTransitionException - 
	 */
	private void buildMealyTransitions(String[][] rawTransitions) throws MealyTransitionException {
		 for (int i = 1; i < rawTransitions.length; i++) {
			IMealyState currentState = null;
			for (int j = 0; j < rawTransitions[i].length; j++) {
				switch (j) {
				case 0:
					currentState = states.get(rawTransitions[i][j]);
					break;
				default:
					char inputReceived = rawTransitions[0][j].charAt(0);
					State targetState = states.get("" + rawTransitions[i][j].toUpperCase().charAt(0));
					char outputGiven = rawTransitions[i][j].charAt(2);
					IMealyTransition newTransition = new Transition(inputReceived, targetState);
					newTransition.setOutput(outputGiven);
					currentState.addTransition(newTransition);
					break;
				}
			}
		}
	}
	
	private void buildMooreTransitions(String[][] rawTransitions) throws MooreTransitionException {
		
	}
	
	public char[] getInputAlphabet() {
		return inputAlphabet;
	}

	public void setInputAlphabet(char[] inputAlphabet) {
		this.inputAlphabet = inputAlphabet;
	}

	public char[] getOutputAlphabet() {
		return outputAlphabet;
	}

	public void setOutputAlphabet(char[] outputAlphabet) {
		this.outputAlphabet = outputAlphabet;
	}

	

}
