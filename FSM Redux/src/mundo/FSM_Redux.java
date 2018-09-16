package mundo;

import excepciones.AlphabetException;
import excepciones.MachineException;
import excepciones.MealyException;

public class FSM_Redux {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------

	/**
	 * Representa la máquina de estados a la que actualmente se le está calculando
	 * la máquina mínima conexa
	 */
	private FSM currentFSM;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------

	/**
	 * Crea una instancia del control del modelo. La máquina actual no está definida
	 */
	public FSM_Redux() {
		currentFSM = null;
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------

	/**
	 * @param type
	 * @param rawInputAlphabet
	 * @param rawOutputAlphabet
	 * @param transitionFunction
	 */
	public void createFSM(boolean type, String rawInputAlphabet, String rawOutputAlphabet, 
			String rawStates, String transitionFunction) throws MachineException {
		currentFSM = new FSM(type, rawInputAlphabet, rawOutputAlphabet, rawStates, transitionFunction);
	}
	
	private void createMealyFSM(String rawInputAlphabet, String rawOutputAlphabet,
			String rawStates, String transitionFunction) throws MealyException{
		try {
			char[] builtInputAlphabet = buildAlphabetSet(rawInputAlphabet);
			char[] builtOutputAlphabet = buildAlphabetSet(rawOutputAlphabet);
			
		} catch (AlphabetException e) {
			throw new MealyException(e.getMessage());
		}
	}
	
	/**
	 * Método que se encarga de verificar que los símbolos del alfabeto solo
	 * tengan un caracter.
	 * @param alphabet - Es la cadena que contiene a los símbolos del alfabeto separados por
	 * espacios.
	 * @return Un arreglo de caracteres con los símbolos de la máquina
	 * @throws AlphabetException Si alguno de los símbolos de la cadena tiene longitud mayor que 1
	 */
	private char[] buildAlphabetSet(String alphabet) throws AlphabetException {
		String[] split = alphabet.split(" ");
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
	
	

	public FSM buildMinFSM() {
		return null;

	}

	private FSM removeInaccesibleStates() {
		return null;

	}

	private Partition partitioningProcedure() {
		return null;

	}

	private FSM buildMinFSM(Partition partition) {
		return null;

	}

}
