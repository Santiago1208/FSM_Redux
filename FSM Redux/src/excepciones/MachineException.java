package excepciones;

public class MachineException extends Exception {

	/**
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = -7193697633739370322L;
	
	// -----------------------------------------------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------------------------------------------
	
	/**
	 * Construye la excepci�n para los errores relacionados con las m�quinas de Mealy o Moore
	 * @param message - Es la explicaci�n de la excepci�n
	 */
	public MachineException(String message) {
		super(message);
	}
	
	

}
