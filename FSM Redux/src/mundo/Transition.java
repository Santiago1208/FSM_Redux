package mundo;

public abstract class Transition {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el est�mulo que origina la transici�n.
	 */
	protected Character stimulus;
	
	/**
	 * Representa el estado al que apunta la transici�n despu�s de presentado el est�mulo
	 */
	protected State target;
	
	/**
	 * Representa la m�quina a la cual pertenece la transici�n
	 */
	protected Machine owner;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una transici�n relacionada con una m�quina, con el est�mulo
	 * y estado de destino especificado.
	 * @param owner Es la m�quina propietaria de la transici�n.
	 * @param stimulus Es el est�mulo que provoca la transici�n.
	 * @param target Es el estado al que apunta la transici�n despu�s de presentado el est�mulo
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
	 * M�todo que se encarga de retornar el est�mulo que provoca la transici�n.
	 * @return El s�mbolo del alfabeto de entrada que provoca la transici�n a otro estado.
	 */
	public Character getStimulus() {
		return stimulus;
	}
	
	/**
	 * M�todo que se encaega de retornar el estado al que apunta la transici�n despu�s
	 * de dado el est�mulo.
	 * @return El estado al cual apunta la transici�n despu�s de presentado el est�mulo.
	 */
	public State getTarget() {
		return target;
	}
	
}
