package excepciones;

public class TransitionException extends MachineException {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = -5556711483790840223L;

	public TransitionException(String message) {
		super(message);
	}

}
