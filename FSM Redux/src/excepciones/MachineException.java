package excepciones;

public class MachineException extends Exception {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = -7193697633739370322L;
	
	// -----------------------------------------------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------------------------------------------
	
	/**
	 * Construye la excepción para los errores relacionados con las máquinas de Mealy o Moore
	 * @param message - Es la explicación de la excepción
	 */
	public MachineException(String message) {
		super(message);
	}
	
	

}
