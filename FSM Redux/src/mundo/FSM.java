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
	 * Representa una m�quina tipo Mealy
	 */
	public final static boolean MEALY_TYPE = true;
	
	/**
	 * Representa una m�quina tipo Moore
	 */
	public final static boolean MOORE_TYPE = false;
	
	/**
	 * Representa la longitud de los s�mbolos de los alfabetos de
	 * la m�quina y de los nombres de los estados
	 */
	public final static int LENGTH_ALPHABET_SYMBOLS = 1;
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el tipo de la m�quina. True es Mealy, false es Moore
	 */
	private boolean type;
	
	/**
	 * Representa el conjunto de simbolos de entrada de la m�quina
	 */
	private char[] inputAlphabet;
	
	/**
	 * Representa el conjunto de simbolos de salida de la m�quina
	 */
	private char[] outputAlphabet;

	/**
	 * Representa el conjunto de estados de la m�quina
	 */
	private HashMap<String, State> states;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------

	
	public FSM(boolean type, String rawInputAlphabet, String rawOutputAlphabet, 
			String rawStates, String transitionFunction) throws MachineException {
		this.type = type;
		inputAlphabet = buildAlphabetSet(rawInputAlphabet);
		outputAlphabet = buildAlphabetSet(rawOutputAlphabet);
		states = buildStateSet(rawStates);
		
		
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------	
	
	/**
	 * M�todo que se encarga de verificar que los s�mbolos del alfabeto solo
	 * tengan un caracter.
	 * @param rawAlphabet - Es la cadena que contiene a los s�mbolos del alfabeto separados por
	 * espacios.
	 * @return Un arreglo de caracteres con los s�mbolos de la m�quina
	 * @throws AlphabetException Si alguno de los s�mbolos de la cadena tiene longitud mayor que 1
	 */
	private char[] buildAlphabetSet(String rawAlphabet) throws AlphabetException {
		String[] split = rawAlphabet.split(" ");
		char[] builtAlphabet = new char[split.length];
		for (int i = 0; i < split.length; i++) {
			String currentSymbol = split[i];
			if (currentSymbol.length() > FSM.LENGTH_ALPHABET_SYMBOLS) {
				throw new AlphabetException("S�mbolo no aceptable por la m�quina: " + currentSymbol);
			}
			char convertedSymbol = currentSymbol.charAt(0);
			builtAlphabet[i] = convertedSymbol;
		}
		return builtAlphabet;
	}
	
	/**
	 * M�todo que se encarga de crear el conjunto de estados a partir de una cadena de
	 * caracteres separados por espacios
	 * @param rawStates - Es la cadena de caracteres que contiene los estados separados por espacios
	 * @return Un Map con los estados recuperados de la cadena de caracteres
	 * @throws StateException - Si el nombre de alg�n estado excede de 1 caracter
	 */
	private HashMap<String, State> buildStateSet(String rawStates) throws StateException {
		HashMap<String, State> states = new HashMap<>();
		String[] split = rawStates.split(" ");
		for (int i = 0; i < split.length; i++) {
			String currentState = split[i];
			if (currentState.length() > LENGTH_ALPHABET_SYMBOLS) {
				throw new StateException("Estado no aceptable por la m�quina: " + currentState);
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
	public void buildTransitions(boolean typeMachine, String rawTransitions) throws TransitionException {
		String[] rows = rawTransitions.split("\n");
		if (rows.length != states.size()) {
			throw new TransitionException("Algunos estados no tienen transiciones definidas");
		}
		if (typeMachine == FSM.MEALY_TYPE) {
			buildMealyTransitions(rows);
		} else {
			buildMooreTransitions(rows);
		}
	}
	
	private void buildMealyTransitions(String[] rows) throws MealyTransitionException {
		 for (int i = 0; i < rows.length; i++) {
			String currentRow = rows[i];
			String[] items = currentRow.split(" ");
			if (items.length != inputAlphabet.length + 1) {
				throw new MealyTransitionException("Para algunas entradas no se ha definido transici�n");
			}
			State currentState = states.get(items[0].trim().toUpperCase());
			for (int j = 1; j < items.length; j++) {
				String currentItem = items[j];
				if (currentItem.length() != Transition.MEALY_TRANSITION_COMPONENTS) {
					throw new MealyTransitionException("Especificaci�n errada de transici�n.\n"
							+ "Forma esperada: estadoDestino,salidaEstado.\n"
							+ "Forma ingresada:" + currentItem);
				}
				char inputReceived = currentItem.charAt(0);
				State targetState = states.get("" + currentItem.charAt(2));
				Transition newTransition = new Transition(inputReceived, targetState);
			}
		}
	}
	
	private void buildMooreTransitions(String[] rows) throws MooreTransitionException {
		
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
