package excepciones;

public class AlphabetException extends MachineException {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = 2918171711314364784L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepción para errores en los alfabetos
	 * @param message - Es el mensaje que explica la excepción
	 */
	public AlphabetException(String message) {
		super(message);
	}

}
