package mundo;

public class FSM_Redux {
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa la máquina la cual será reducida.
	 */
	private Machine notReducedMachine;
	
	/**
	 * Representa la versión reducida de la máquina ingresada.
	 */
	private Machine reducedMachine;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una instancia de la controladora con la máquina a reducir y la máquina reducida
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
	 * Método que se encarga de retornar la máquina que se va a reducir
	 * @return Dependiendo del tipo, retorna una máquina tipo Mealy o tipo Moore.
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
	 * Método que se encarga de retornar la máquina reducida
	 * @return Dependiendo del tipo, retorna una máquina tipo Mealy o tipo Moore.
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
