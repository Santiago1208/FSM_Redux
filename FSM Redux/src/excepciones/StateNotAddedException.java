package excepciones;

public class StateNotAddedException extends Exception {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = -8043270684225293108L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepción para un estado de la máquina que no se haya
	 * podido agregar.
	 * @param message Es la causa de la excepción
	 */
	public StateNotAddedException(String message) {
		super(message);
	}

}
