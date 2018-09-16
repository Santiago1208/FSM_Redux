package excepciones;

public class StateException extends MachineException {

	/**
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = -5766379558592464966L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------

	public StateException(String message) {
		super(message);
	}

}
