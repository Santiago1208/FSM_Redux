package mundo;

import excepciones.StateNotAddedException;

public class Moore extends Machine {
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * @param type
	 * @param inputAlphabet
	 * @param outputAlphabet
	 */
	public Moore(Boolean type, Character[] inputAlphabet, Character[] outputAlphabet) {
		super(type, inputAlphabet, outputAlphabet);
	}
	
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Método que se encarga de agregar un estado con el nombre y estado de salida especificados
	 * a la maquina. Al nombre del estado se le concatena la salida
	 * @param name Es el nombre del estado.
	 * @param outputSymbol Es el símbolo del alfabeto de salida que proporciona el estado
	 * @throws StateNotAddedException Si no se especifica nombre al estado o no se encuentra el símbolo
	 * de salida en el alfabeto de salida o existe un estado con el mismo nombre
	 */
	public void addState(String name, Character outputSymbol) throws StateNotAddedException {
		name = name.trim().toUpperCase();
		if (name.equals("")) {
			throw new StateNotAddedException("No ha especificado el nombre del estado");
		}
		Boolean existOutput = existSymbolInAlphabet(outputSymbol, false);
		if (existOutput == false) {
			throw new StateNotAddedException("No se encuentra el símbolo " + outputSymbol + 
					" en el alfabeto de salida");
		}
		MooreState s  = (MooreState) findState(name);
		if (s != null) {
			throw new StateNotAddedException("Ya existe un estado");			
		}
		s = new MooreState(this, name, outputSymbol);
		states.put(name.concat("," + outputSymbol.toString()), s);
	}
	

}
