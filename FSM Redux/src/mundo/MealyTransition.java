package mundo;

import excepciones.TransitionNotAddedException;

public class MealyTransition extends Transition {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el s�mbolo de salida cuando la transici�n se ha dado.
	 */
	private Character output;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una transici�n tipo Mealy relacionada a una m�quina con el est�mulo, estado de
	 * llegada y s�mbolo de salida especificado.
	 * @param owner Es la m�quina propietaria de la transici�n.
	 * @param stimulus Es el est�mulo que provoca la transici�n.
	 * @param target Es el estado al que apunta la transici�n despu�s de presentado el est�mulo.
	 * @param output Es el s�mbolo del alfabeto de salida proporcionado por la transici�n despu�s
	 * de presentado el est�mulo
	 * @throws TransitionNotAddedException Si el s�mbolo de salida no se encuentra en el alfabeto de
	 * salida definido en la m�quina
	 */
	public MealyTransition(Machine owner, Character stimulus, State target, Character output)
			throws TransitionNotAddedException {
		super(owner, stimulus, target);
		Boolean existSymbol = this.owner.existSymbolInAlphabet(output, false);
		if (existSymbol == false) {
			throw new TransitionNotAddedException("No se encontr� el s�mbolo " + output + 
					" en el alfabeto de salida de la m�quina");
		}
		this.output = output;
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * M�todo que se encarga de retornar el s�mbolo de salida de la transici�n.
	 * @return El s�mbolo de salida proporcionado despu�s de presentado el est�mulo.
	 */
	public Character getOutput() {
		return output;
	}

}
