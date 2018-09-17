package excepciones;

public class StateNotAddedException extends Exception {

	/**
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = -8043270684225293108L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepci�n para un estado de la m�quina que no se haya
	 * podido agregar.
	 * @param message Es la causa de la excepci�n
	 */
	public StateNotAddedException(String message) {
		super(message);
	}

}
