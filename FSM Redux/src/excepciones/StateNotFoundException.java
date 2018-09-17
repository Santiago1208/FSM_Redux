package excepciones;

public class StateNotFoundException extends Exception {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = -8486842514974849162L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepción para un estado de la máquina que no se haya
	 * encontrado.
	 * @param message Es la causa de la excepción
	 */
	public StateNotFoundException(String message) {
		super(message);
	}

}
