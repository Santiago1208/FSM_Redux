package mundo;

import excepciones.TransitionNotAddedException;

public class MealyTransition extends Transition {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el símbolo de salida cuando la transición se ha dado.
	 */
	private Character output;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una transición tipo Mealy relacionada a una máquina con el estímulo, estado de
	 * llegada y símbolo de salida especificado.
	 * @param owner Es la máquina propietaria de la transición.
	 * @param stimulus Es el estímulo que provoca la transición.
	 * @param target Es el estado al que apunta la transición después de presentado el estímulo.
	 * @param output Es el símbolo del alfabeto de salida proporcionado por la transición después
	 * de presentado el estímulo
	 * @throws TransitionNotAddedException Si el símbolo de salida no se encuentra en el alfabeto de
	 * salida definido en la máquina
	 */
	public MealyTransition(Machine owner, Character stimulus, State target, Character output)
			throws TransitionNotAddedException {
		super(owner, stimulus, target);
		Boolean existSymbol = this.owner.existSymbolInAlphabet(output, false);
		if (existSymbol == false) {
			throw new TransitionNotAddedException("No se encontró el símbolo " + output + 
					" en el alfabeto de salida de la máquina");
		}
		this.output = output;
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Método que se encarga de retornar el símbolo de salida de la transición.
	 * @return El símbolo de salida proporcionado después de presentado el estímulo.
	 */
	public Character getOutput() {
		return output;
	}

}
