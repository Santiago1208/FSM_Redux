package mundo;

public class Transition implements IMealyTransition, IMooreTransition {
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el n�mero de elementos que debe tener la especificaci�n de una transici�n
	 * tipo Mealy: estadoDestino,salidaTransici�n
	 */
	public final static int MEALY_TRANSITION_COMPONENTS = 3;
	
	
	/**
	 * Representa el n�mero de elementos que debe tener la especificaci�n de una transici�n
	 * tipo Moore: estadoDestino
	 */
	public final static int MOORE_TRANSITION_COMPONENTS = 1;
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el s�mbolo de entrada que origina la transici�n
	 */
	private char inputReceived;
	
	/**
	 * Representa el s�mbolo de salida que resulta despu�s de efectuada la transici�n
	 */
	private char outputGiven;
	
	/**
	 * Representa el estado de destino de la transici�n
	 */
	private State targetState;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------

	
	/**
	 * @param inputReceived
	 * @param targetState
	 */
	public Transition(char inputReceived, State targetState) {
		this.inputReceived = inputReceived;
		this.targetState = targetState;
	}
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------

	@Override
	public char getOutput() {
		return outputGiven;
	}

	@Override
	public IMooreState getDestinationStateMoore() {
		return null;
	}

	@Override
	public IMealyState getDestinationStateMealy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOutput(char output) {
		outputGiven = output;
		
	}

}
