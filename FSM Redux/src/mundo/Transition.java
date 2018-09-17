package mundo;

public abstract class Transition {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el estímulo que origina la transición.
	 */
	protected Character stimulus;
	
	/**
	 * Representa el estado al que apunta la transición después de presentado el estímulo
	 */
	protected State target;
	
	/**
	 * Representa la máquina a la cual pertenece la transición
	 */
	protected Machine owner;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una transición relacionada con una máquina, con el estímulo
	 * y estado de destino especificado.
	 * @param owner Es la máquina propietaria de la transición.
	 * @param stimulus Es el estímulo que provoca la transición.
	 * @param target Es el estado al que apunta la transición después de presentado el estímulo
	 */
	public Transition(Machine owner, Character stimulus, State target) {
		this.owner = owner;
		this.stimulus = stimulus;
		this.target = target;
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Método que se encarga de retornar el estímulo que provoca la transición.
	 * @return El símbolo del alfabeto de entrada que provoca la transición a otro estado.
	 */
	public Character getStimulus() {
		return stimulus;
	}
	
	/**
	 * Método que se encaega de retornar el estado al que apunta la transición después
	 * de dado el estímulo.
	 * @return El estado al cual apunta la transición después de presentado el estímulo.
	 */
	public State getTarget() {
		return target;
	}
	
}
