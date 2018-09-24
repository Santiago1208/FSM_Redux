package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class NewFsmPanel extends JPanel implements ActionListener {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = 2969730389852469515L;
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa la acción de creación de nueva máquina de estados
	 */
	public static final String NEW_FSM = "Crear Máquina";
	
	public static final String TAB_EMP = "Crear tabla de transiciones vacía";

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
	 * Representa la opción de máquina tipo Mealy
	 */
	private JRadioButton radioMealy;
	
	/**
	 * Representa la opción de máquina tipo Moore
	 */
	private JRadioButton radioMoore;
	
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
	 * Representa la etiqueta para la función de transición
	 */
	private JLabel labelFunction;
	
	/**
	 * Representa el botón para crear una nueva máquina
	 */
	private JButton buttonNewFsm;
	
	/**
	 * Representa el modelo usado dentro de la tabla
	 */
	private DefaultTableModel tableModel;
	
	/**
	 * Representa los datos del cuerpo de la tabla
	 */
	private String[][] tableData;
	
	/**
	 * Tabla que muestra la matriz de los componentes de la función de transición
	 * 	 */
	private JTable transitionTableFunction;
	
	
	/**
	 * filas correspondientes al conjunto de datos que tendrá la función de transición
	 */
	private int filasTransitionFunction;
	
	/**
	 * columnas correspondientes a la cantidad de variables de la función de transición
	 */
	private int columnasTransitionFunction; 
	
	/**
	 * Representa el botón que al accionarlo crea la tabla con filas y columnas vacías para introducir los estados
	 */
	private JButton buttonCreateEmptyTransitionsMatrix;
	
	/**
	 * Representa la ventana propietaria del panel
	 */
	private MainWindow mainWindow;
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	public NewFsmPanel(MainWindow owner) {
		// Propiedades básicas
		mainWindow = owner;
		setLayout(new BorderLayout());
	    
		// Inicialización de componentes
		TitledBorder border = new TitledBorder("Nuevas FSM");
		JPanel panelAux0 = new JPanel(new FlowLayout(FlowLayout.LEFT));	
		JPanel panelAux1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panelAux2 = new JPanel(new BorderLayout());
		
		//Componentes panelAux0
		radioMealy = new JRadioButton("Mealy");
		radioMoore = new JRadioButton("Moore");
		radioGroup = new ButtonGroup();
		radioGroup.add(radioMealy);
		radioGroup.add(radioMoore);
		panelAux0.add(radioMealy);
		panelAux0.add(radioMoore);
		
		//Componentes panelAux1
		labelInput = new JLabel("Alfabeto de entrada: ");
		labelOutput = new JLabel("Alfabeto de salida:    ");
		labelStates = new JLabel("Conjunto de estados:");
		textInput = new JTextField(20);
		textOutput = new JTextField(20);
		textStates = new JTextField(20);
		buttonCreateEmptyTransitionsMatrix = new JButton("Generar Tabla de transiciones vacía");
		buttonCreateEmptyTransitionsMatrix.addActionListener(this);
		buttonCreateEmptyTransitionsMatrix.setActionCommand(TAB_EMP);
		panelAux1.add(labelInput);
		panelAux1.add(textInput);
		panelAux1.add(labelOutput);
		panelAux1.add(textOutput);
		panelAux1.add(labelStates);
		panelAux1.add(textStates);
		panelAux1.add(buttonCreateEmptyTransitionsMatrix);
		//Componentes panelAux2
		labelFunction = new JLabel("Función de transición");
		transitionTableFunction = new JTable(tableModel);
		buttonNewFsm= new JButton("Crear máquina"); 
		buttonNewFsm.addActionListener(this);
		buttonNewFsm.setActionCommand(NEW_FSM);
		panelAux2.add(labelFunction, BorderLayout.NORTH);
		panelAux2.add(transitionTableFunction,BorderLayout.CENTER);
		panelAux2.add(buttonNewFsm, BorderLayout.SOUTH);
		
		border.setTitleJustification(TitledBorder.LEFT);
		border.setTitlePosition(TitledBorder.TOP);
		this.setBorder(border);
		this.add(panelAux0, BorderLayout.NORTH);
		this.add(panelAux1,BorderLayout.CENTER);
		this.add(panelAux2,BorderLayout.PAGE_END);
		
		
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand( );
        if( comando.equals( NEW_FSM ) ) {
        }
        
        if( comando.equals( TAB_EMP ) ) {
        	crearTablaTransitionFunctionMealy();
        }

	}
	
	public void crearTablaTransitionFunctionMealy(){
		
		String arregloItemsAlfabetoEntrada[] = textInput.getText().split(",");
		String arregloItemsSetStates[] = textStates.getText().split(",");

		DefaultTableModel tableModelTransitionFunction = new DefaultTableModel(arregloItemsAlfabetoEntrada.length+1, arregloItemsSetStates.length+1);
		transitionTableFunction = new JTable(tableModelTransitionFunction);

		for (int i = 0; i < arregloItemsAlfabetoEntrada.length; i++) 
			tableModelTransitionFunction.addColumn(arregloItemsAlfabetoEntrada[i]);
		
		Object[][] rowLabels = new Object[arregloItemsAlfabetoEntrada.length][arregloItemsSetStates.length+1];
		for (int i = 0; i < arregloItemsSetStates.length; i++) {
			rowLabels[0][i]=arregloItemsSetStates[i];
//					tableModelTransitionFunction.insertRow(i, arregloItemsSetStates[i]);
		}
		for (int i = 0; i < rowLabels.length; i++) {
			Object[] Aux = new String[rowLabels.length];
			for (int j = 0; j < Aux.length; j++) {
				
				Aux[j]= rowLabels[j][0];
			}
			tableModelTransitionFunction.addRow(Aux);
		}
		
		repaint();
	}
	
	public void crearTablaTransitionFunctionMoore(){


	}
	
	
	public void crearMaq() {
		String alfabetoEntrada = textInput.getText();
		String alfabetoSalida = textOutput.getText();
		String conjuntoEstados = textStates.getText();
//		mainWindow.CrearMaquina(al);
		
	}
	
}
