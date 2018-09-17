package mundo;

import excepciones.TransitionNotAddedException;

public class MooreState extends State {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el s�mbolo de salida del estado
	 */
	private Character outputSymbol;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	
	/**
	 * M�todo que se encarga de construir un estado tipo Moore.
	 * @param owner Es la m�quina propietaria de este estado.
	 * @param name Es el nombre que recibir� el estado.
	 * @param outputSymbol Es el s�mbolo de salida que tendr� el estado. Este s�mbolo debe existir
	 * en el conjunto del alfabeto de salida de la m�quina propietaria.
	 * @throws TransitionNotAddedException Si el s�mbolo de salida no se encontr� en el alfabeto
	 * de salida de la m�quina propietaria.
	 */
	public MooreState(Machine owner, String name, Character outputSymbol) {
		super(owner, name);
		this.outputSymbol = outputSymbol;
	}
	
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * M�todo que se encarga de retornar el s�mbolo de salida del estado.
	 * @return El s�mbolo de salida del estado.
	 */
	public Character getOutputSymbol() {
		return outputSymbol;
	}
	
	/**
	 * M�todo que se encarga de agregar una transici�n al estado.
	 * @param input Es el est�mulo que origina la transici�n. Debe existir en el alfabeto de entrada
	 * de la m�quina.
	 * @param target Es el estado al cual apunta la transici�n despu�s de recibir el est�mulo.
	 * @throws TransitionNotAddedException Cuando no existan ni el s�mbolo en el alfabeto de entrada, ni
	 * el estado de destino en el conjunto de estados o se haya excedido la cantidad m�xima de transiciones
	 * que se pueden agregar (determinado por la cardinalidad del conjunto de s�mbolos del alfabeto de 
	 * entrada)
	 */
	public void addTransition(Character input, State target) throws TransitionNotAddedException {
		if (target == null) {
			throw new TransitionNotAddedException("Estado de destino de la transici�n no especificado");
		}
		Boolean existInputSymbol = owner.existSymbolInAlphabet(input, true);
		if (existInputSymbol == false) {
			throw new TransitionNotAddedException("La transici�n tiene un s�mbolo no definido "
					+ "en el alfabeto de entrada: " + input);
		}
		
		// TODO
	}

}
