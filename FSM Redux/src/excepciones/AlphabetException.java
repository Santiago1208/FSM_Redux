package excepciones;

public class AlphabetException extends MachineException {

	/**
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = 2918171711314364784L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepci�n para errores en los alfabetos
	 * @param message - Es el mensaje que explica la excepci�n
	 */
	public AlphabetException(String message) {
		super(message);
	}

}
