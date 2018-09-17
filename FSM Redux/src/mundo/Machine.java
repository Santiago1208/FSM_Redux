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
	 * Representa el tipo de la máquina. Puede ser Mealy (true) o Moore (false)
	 */
	protected Boolean type;
	
	/**
	 * Representa el alfabeto de entrada compatible con la máquina.
	 */
	protected Character[] inputAlphabet;
	
	/**
	 * Representa el alfabeto de salida compatible con la máquina.
	 */
	protected Character[] outputAlphabet;
	
	/**
	 * Representa el conjunto de estados registrados en la máquina.
	 */
	protected HashMap<String, State> states;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una máquina con el tipo, alfabeto de entrada y salida definidos.
	 * @param type Es el tipo de la máquina. Puede ser uno de los valores Machine.MEALY_TYPE o 
	 * Machine.MOORE_MACHINE
	 * @param inputAlphabet - Es el alfabeto de entrada de la máquina
	 * @param outputAlphabet - Es el alfabeto de salida de la máquina.
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
	 * Método que se encarga de retornar el tipo de la máquina
	 * @return true si la máquina es tipo Mealy o false si es tipo Moore
	 */
	public Boolean getType() {
		return type;
	}
	
	/**
	 * Método que se encarga de retornar el alfabeto de entrada de la máquina
	 * @return El conjunto de símbolos de entrada compatible con la máquina.
	 */
	public Character[] getInputAlphabet() {
		return inputAlphabet;
	}
	
	/**
	 * Método que se encarga de retornar la cardinalidad del alfabeto de entrada.
	 * @return El número de elementos del conjunto de símbolos
	 */
	public Integer getInputAlphabetCardinality() {
		return inputAlphabet.length;
	}
	
	/**
	 * Método que se encarga de retornar el alfabeto de salida de la máquina
	 * @return El conjunto de símbolos de salida compatible con la máquina.
	 */
	public Character[] getOutputAlphabet() {
		return outputAlphabet;
	}
	
	/**
	 * Método que se encarga de retornar los estados registrados en la máquina.
	 * @return El conjunto de estados registrados en la máquina.
	 */
	public HashMap<String, State> getStates() {
		return states;
	}
	
	/**
	 * Método que se encarga de verificar si el símbolo especificado se encuentra en 
	 * en el alfabeto especificado.
	 * @param symbol Es el símbolo que se quiere verificar
	 * @param inInputAlphabet Es el valor que indica en qué alfabeto buscar: true para el de entrada, false para
	 * el de salida.
	 * @return True si el símbolo está en el alfabeto indicado, false de lo contrario.
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
	 * Método que se encarga de buscar el estado con el nombre especificado
	 * @param stateName Es el nombre con que se desea buscar el estado.
	 * @return El estado con el nombre especificado
	 */
	public State findState(String stateName) {
		State s = states.get(stateName);
		return s;
	}
	
	/**
	 * Método que se encarga de determinar si un símbolo se encuentra en determinado alfabeto
	 * @param symbol Es el símbolo que se desea verificar
	 * @param alphabet Es el alfabeto en el cual se buscará el símbolo
	 * @return True si el símbolo está en el alfabeto, false de lo contrario.
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
