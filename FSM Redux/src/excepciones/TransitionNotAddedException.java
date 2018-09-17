package excepciones;

public class TransitionNotAddedException extends Exception {

	/**
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = -747548486798974580L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepci�n para una transici�n de un estado que no se haya
	 * agregado.
	 * @param message Es la causa de la excepci�n
	 */
	public TransitionNotAddedException(String message) {
		super(message);
	}
	
}
