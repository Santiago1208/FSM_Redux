package excepciones;

public class MealyException extends MachineException {

	/**
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = -6060696810347434371L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepci�n tipo Mealy
	 * @param message - Es el mensaje que explica la excepci�n
	 */
	public MealyException(String message) {
		super(message);
	}

}
