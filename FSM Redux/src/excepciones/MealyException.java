package excepciones;

public class MealyException extends MachineException {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = -6060696810347434371L;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Construye una excepción tipo Mealy
	 * @param message - Es el mensaje que explica la excepción
	 */
	public MealyException(String message) {
		super(message);
	}

}
