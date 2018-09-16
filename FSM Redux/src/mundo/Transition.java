package mundo;

public class Transition implements IMealyTransition, IMooreTransition {
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el número de elementos que debe tener la especificación de una transición
	 * tipo Mealy: estadoDestino,salidaTransición
	 */
	public final static int MEALY_TRANSITION_COMPONENTS = 3;
	
	
	/**
	 * Representa el número de elementos que debe tener la especificación de una transición
	 * tipo Moore: estadoDestino
	 */
	public final static int MOORE_TRANSITION_COMPONENTS = 1;
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa el símbolo de entrada que origina la transición
	 */
	private char inputReceived;
	
	/**
	 * Representa el símbolo de salida que resulta después de efectuada la transición
	 */
	private char outputGiven;
	
	/**
	 * Representa el estado de destino de la transición
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
