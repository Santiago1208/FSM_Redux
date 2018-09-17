package mundo;

import excepciones.TransitionNotAddedException;

public class MooreState extends State {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el símbolo de salida del estado
	 */
	private Character outputSymbol;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	
	/**
	 * Método que se encarga de construir un estado tipo Moore.
	 * @param owner Es la máquina propietaria de este estado.
	 * @param name Es el nombre que recibirá el estado.
	 * @param outputSymbol Es el símbolo de salida que tendrá el estado. Este símbolo debe existir
	 * en el conjunto del alfabeto de salida de la máquina propietaria.
	 * @throws TransitionNotAddedException Si el símbolo de salida no se encontró en el alfabeto
	 * de salida de la máquina propietaria.
	 */
	public MooreState(Machine owner, String name, Character outputSymbol) {
		super(owner, name);
		this.outputSymbol = outputSymbol;
	}
	
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Método que se encarga de retornar el símbolo de salida del estado.
	 * @return El símbolo de salida del estado.
	 */
	public Character getOutputSymbol() {
		return outputSymbol;
	}
	
	/**
	 * Método que se encarga de agregar una transición al estado.
	 * @param input Es el estímulo que origina la transición. Debe existir en el alfabeto de entrada
	 * de la máquina.
	 * @param target Es el estado al cual apunta la transición después de recibir el estímulo.
	 * @throws TransitionNotAddedException Cuando no existan ni el símbolo en el alfabeto de entrada, ni
	 * el estado de destino en el conjunto de estados o se haya excedido la cantidad máxima de transiciones
	 * que se pueden agregar (determinado por la cardinalidad del conjunto de símbolos del alfabeto de 
	 * entrada)
	 */
	public void addTransition(Character input, State target) throws TransitionNotAddedException {
		if (target == null) {
			throw new TransitionNotAddedException("Estado de destino de la transición no especificado");
		}
		Boolean existInputSymbol = owner.existSymbolInAlphabet(input, true);
		if (existInputSymbol == false) {
			throw new TransitionNotAddedException("La transición tiene un símbolo no definido "
					+ "en el alfabeto de entrada: " + input);
		}
		
		// TODO
	}

}
