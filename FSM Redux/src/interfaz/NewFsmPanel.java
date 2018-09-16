package interfaz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javafx.scene.control.RadioButton;

public class NewFsmPanel extends JPanel implements ActionListener {

	/**
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = 2969730389852469515L;
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa la acci�n de creaci�n de nueva m�quina de estados
	 */
	public static final String NEW_FSM = "Crear M�quina";
	
	/**
	 * Representa la fuente usada en los campos de este panel
	 */
	private static final Font INPUT_FONT = new Font("Consolas", Font.PLAIN, 16);
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Agrupa los radio buttons para que sean mutuamente excluyentes
	 */
	private ButtonGroup radioGroup;
	
	/**
	 * Representa la opci�n de m�quina tipo Mealy
	 */
	private RadioButton radioMealy;
	
	/**
	 * Representa la opci�n de m�quina tipo Moore
	 */
	private RadioButton radioMoore;
	
	/**
	 * Representa la etiqueta para el alfabeto de entrada
	 */
	private JLabel labelInput;
	
	/**
	 * Representa el campo para el alfabeto de entrada
	 */
	private JTextField textInput;
	
	/**
	 * Representa la etiqueta para el alfabeto de salida
	 */
	private JLabel labelOutput;
	
	/**
	 * Representa el campo para el alfabeto de salida
	 */
	private JTextField textOutput;
	
	/**
	 * Representa la etiqueta para los estados
	 */
	private JLabel labelStates;
	
	/**
	 * Representa el campo para los estados
	 */
	private JTextField textStates;
	
	/**
	 * Representa la etiqueta para la funci�n de transici�n
	 */
	private JLabel labelFunction;
	
	/**
	 * Representa el campo para ingresar la funci�n de transici�n
	 */
	private JTextArea textFunction;
	
	/**
	 * Representa el bot�n para crear una nueva m�quina
	 */
	private JButton buttonNewFsm;
	
	/**
	 * Representa la ventana propietaria del panel
	 */
	private MainWindow mainWindow;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	public NewFsmPanel(MainWindow owner) {
		// Propiedades b�sicas
		mainWindow = owner;
		
		
		// Inicializaci�n de componentes
		
		
		
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
