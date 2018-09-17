package mundo;

import java.util.HashMap;

public abstract class Machine {
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el valor del tipo Moore
	 */
	public final static Boolean MEALY_TYPE = true;
	
	/**
	 * Representa el valor del tipo Mealy
	 */
	public final static Boolean MOORE_TYPE = false;
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el tipo de la m�quina. Puede ser Mealy (true) o Moore (false)
	 */
	protected Boolean type;
	
	/**
	 * Representa el alfabeto de entrada compatible con la m�quina.
	 */
	protected Character[] inputAlphabet;
	
	/**
	 * Representa el alfabeto de salida compatible con la m�quina.
	 */
	protected Character[] outputAlphabet;
	
	/**
	 * Representa el conjunto de estados registrados en la m�quina.
	 */
	protected HashMap<String, State> states;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una m�quina con el tipo, alfabeto de entrada y salida definidos.
	 * @param type Es el tipo de la m�quina. Puede ser uno de los valores Machine.MEALY_TYPE o 
	 * Machine.MOORE_MACHINE
	 * @param inputAlphabet - Es el alfabeto de entrada de la m�quina
	 * @param outputAlphabet - Es el alfabeto de salida de la m�quina.
	 */
	public Machine(Boolean type, Character[] inputAlphabet, Character[] outputAlphabet) {
		this.type = type;
		this.inputAlphabet = inputAlphabet;
		this.outputAlphabet = outputAlphabet;
		states = new HashMap<>();
	}
	
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * M�todo que se encarga de retornar el tipo de la m�quina
	 * @return true si la m�quina es tipo Mealy o false si es tipo Moore
	 */
	public Boolean getType() {
		return type;
	}
	
	/**
	 * M�todo que se encarga de retornar el alfabeto de entrada de la m�quina
	 * @return El conjunto de s�mbolos de entrada compatible con la m�quina.
	 */
	public Character[] getInputAlphabet() {
		return inputAlphabet;
	}
	
	/**
	 * M�todo que se encarga de retornar la cardinalidad del alfabeto de entrada.
	 * @return El n�mero de elementos del conjunto de s�mbolos
	 */
	public Integer getInputAlphabetCardinality() {
		return inputAlphabet.length;
	}
	
	/**
	 * M�todo que se encarga de retornar el alfabeto de salida de la m�quina
	 * @return El conjunto de s�mbolos de salida compatible con la m�quina.
	 */
	public Character[] getOutputAlphabet() {
		return outputAlphabet;
	}
	
	/**
	 * M�todo que se encarga de retornar los estados registrados en la m�quina.
	 * @return El conjunto de estados registrados en la m�quina.
	 */
	public HashMap<String, State> getStates() {
		return states;
	}
	
	/**
	 * M�todo que se encarga de verificar si el s�mbolo especificado se encuentra en 
	 * en el alfabeto especificado.
	 * @param symbol Es el s�mbolo que se quiere verificar
	 * @param inInputAlphabet Es el valor que indica en qu� alfabeto buscar: true para el de entrada, false para
	 * el de salida.
	 * @return True si el s�mbolo est� en el alfabeto indicado, false de lo contrario.
	 */
	public Boolean existSymbolInAlphabet(Character symbol, boolean inInputAlphabet) {
		Boolean exists = new Boolean(false);
		if (inInputAlphabet == true) {
			exists = existSymbol(symbol, inputAlphabet);
		} else {
			exists = existSymbol(symbol, outputAlphabet);
		}
		return exists;
	}
	
	/**
	 * M�todo que se encarga de buscar el estado con el nombre especificado
	 * @param stateName Es el nombre con que se desea buscar el estado.
	 * @return El estado con el nombre especificado
	 */
	public State findState(String stateName) {
		State s = states.get(stateName);
		return s;
	}
	
	/**
	 * M�todo que se encarga de determinar si un s�mbolo se encuentra en determinado alfabeto
	 * @param symbol Es el s�mbolo que se desea verificar
	 * @param alphabet Es el alfabeto en el cual se buscar� el s�mbolo
	 * @return True si el s�mbolo est� en el alfabeto, false de lo contrario.
	 */
	private Boolean existSymbol(Character symbol, Character[] alphabet) {
		Boolean exist = new Boolean(false);
		for (int i = 0; i < alphabet.length && !exist; i++) {
			Character currentSymbol = alphabet[i];
			if (currentSymbol.compareTo(symbol) == 0) {
				exist = true;
			}
		}
		return exist;
	}
	
}
