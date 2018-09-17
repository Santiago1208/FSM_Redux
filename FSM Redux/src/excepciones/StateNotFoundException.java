package excepciones;

public class StateNotFoundException extends Exception {

	/**
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = -8486842514974849162L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepci�n para un estado de la m�quina que no se haya
	 * encontrado.
	 * @param message Es la causa de la excepci�n
	 */
	public StateNotFoundException(String message) {
		super(message);
	}

}
