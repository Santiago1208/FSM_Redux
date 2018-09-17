package mundo;

public abstract class State {
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el nombre del estado.
	 */
	protected String name;
	
	/**
	 * Representa las transiciones del estado.
	 */
	protected Transition[] transitions;
	
	/**
	 * Representa la m�quina propietaria del estado.
	 */
	protected Machine owner;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye un estado relacionandolo con una m�quina y asignando un nombre.
	 * @param owner Es la m�quina propietaria del estado.
	 * @param name Es el nombre del estado
	 */
	public State(Machine owner, String name) {
		this.owner = owner;
		this.name = name;
		transitions = new Transition[this.owner.getInputAlphabetCardinality()];
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * M�todo que se encarga de retornar el nombre del estado.
	 * @return El nombre del estado
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * M�todo que se encarga de retornar las transiciones del estado.
	 * @return El conjunto de transiciones del estado.
	 */
	public Transition[] getTransitions() {
		return transitions;
	}
	
}
