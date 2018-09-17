package mundo;

import excepciones.StateNotAddedException;

public class Mealy extends Machine {
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * @param type
	 * @param inputAlphabet
	 * @param outputAlphabet
	 */
	public Mealy(Boolean type, Character[] inputAlphabet, Character[] outputAlphabet) {
		super(type, inputAlphabet, outputAlphabet);
	}
	
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * @param name
	 * @throws StateNotAddedException
	 */
	public void addState(String name) throws StateNotAddedException {
		name = name.trim().toUpperCase();
		if (name.equals("")) {
			throw new StateNotAddedException("No ha especificado el nombre del estado");
		}
		MealyState s = (MealyState) findState(name);
		if (s != null) {
			throw new StateNotAddedException("Ya existe un estado con nombre " + name);
		}
		s = new MealyState(this, name);
		states.put(name, s);
	}

}
