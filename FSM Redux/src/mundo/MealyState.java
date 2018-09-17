package mundo;

import excepciones.TransitionNotAddedException;

public class MealyState extends State {
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * @param owner
	 * @param name
	 */
	public MealyState(Machine owner, String name) {
		super(owner, name);
	}
	
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------

	/**
	 * @param input
	 * @param output
	 * @param target
	 * @throws TransitionNotAddedException
	 */
	public void addTransition(Character input, Character output, State target) 
			throws TransitionNotAddedException {
		if (target == null) {
			throw new TransitionNotAddedException("Estado de destino de la transición no especificado");
		}
		Boolean existInputSymbol = owner.existSymbolInAlphabet(input, true);
		if (existInputSymbol == false) {
			throw new TransitionNotAddedException("La transición tiene un símbolo no definido "
					+ "en el alfabeto de entrada: " + input);
		}
		Boolean existOutputSymbol = owner.existSymbolInAlphabet(output, false);
		if (existOutputSymbol == false) {
			throw new TransitionNotAddedException("La transición tiene un símbolo no definido "
					+ "en el alfabeto de salida: " + output);
		}
		
		// TODO
		
	}
}
