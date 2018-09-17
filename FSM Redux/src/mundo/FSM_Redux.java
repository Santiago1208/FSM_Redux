package mundo;

public class FSM_Redux {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa la m�quina la cual ser� reducida.
	 */
	private Machine notReducedMachine;
	
	/**
	 * Representa la versi�n reducida de la m�quina ingresada.
	 */
	private Machine reducedMachine;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una instancia de la controladora con la m�quina a reducir y la m�quina reducida
	 * nulas.
	 */
	public FSM_Redux() {
		notReducedMachine = null;
		reducedMachine = null;
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * M�todo que se encarga de retornar la m�quina que se va a reducir
	 * @return Dependiendo del tipo, retorna una m�quina tipo Mealy o tipo Moore.
	 */
	public Machine getNotReducedMachine() {
		Machine m = null;
		if (notReducedMachine != null) {
			if (notReducedMachine.getType().compareTo(Machine.MEALY_TYPE) == 0) {
				m = (Mealy) notReducedMachine;
			} else {
				m = (Moore) notReducedMachine;
			}
		}
		return m;
	}
	
	/**
	 * M�todo que se encarga de retornar la m�quina reducida
	 * @return Dependiendo del tipo, retorna una m�quina tipo Mealy o tipo Moore.
	 */
	public Machine getReducedMachine() {
		Machine m = null;
		if (reducedMachine != null) {
			if (reducedMachine.getType().compareTo(Machine.MEALY_TYPE) == 0) {
				m = (Mealy) reducedMachine;
			} else {
				m = (Moore) reducedMachine;
			}
		}
		return m;
	}
}
