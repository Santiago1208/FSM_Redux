package excepciones;

public class TransitionNotAddedException extends Exception {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = -747548486798974580L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepción para una transición de un estado que no se haya
	 * agregado.
	 * @param message Es la causa de la excepción
	 */
	public TransitionNotAddedException(String message) {
		super(message);
	}
	
}
