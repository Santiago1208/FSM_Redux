package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FsmReduxPanel extends JPanel implements ActionListener {

	/**
	 * Versión de serialización
	 */
	private static final long serialVersionUID = -5505572058567690378L;
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa la acción de calcular la versión reducida de la máquina de estados finitos
	 */	
	public static final String CLC_FSM_REDUX = "Calcular FSM reducida";
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Tabla que muestra la matriz de los componentes de la FSM reducida
	 */
	private JTable tableFSMRedux;
	
	/**
	 * Representa el modelo usado dentro de la tabla
	 */
	private DefaultTableModel tableModel;
	
	/**
	 * Representa los datos del cuerpo de la tabla
	 */
	private String[][] tableData;
	
	/**
	 * Representa la cabecera de la tabla.
	 */
	private String[] header;
	
	/**
	 * Representa el botón para crear una nueva máquina de estado finito reducida
	 */
	private JButton buttonCalculate; 
	
	/**
	 * Representa la ventana propietaria del panel
	 */
	private MainWindow mainWindow;
	
	public FsmReduxPanel(MainWindow owner) {
		// Propiedades básicas
		mainWindow = owner;
		setLayout(new BorderLayout());
		
		// Inicialización de componentes
		TitledBorder border = new TitledBorder("FSM Reducida");
		border.setTitleJustification(TitledBorder.LEFT);
		border.setTitlePosition(TitledBorder.TOP);
		setBorder(border);
		
		// Tabla
//		tableData = new String[0][0];
//		header = new String[0];
		
		//Inicio de tabla
		String [] header={"name","age"};
		Object [][] data={{"akash","20"},{"pankaj","24"},{"pankaj","24"},{"pankaj","24"},{"pankaj","24"}};
		
//		tableModel = new DefaultTableModel(data, header);
		tableFSMRedux = new JTable(data, header);
		
		// Botón para calcular
		buttonCalculate = new JButton("Calcular FSM reducida");
		buttonCalculate.addActionListener(this);
		buttonCalculate.setActionCommand(CLC_FSM_REDUX);
		
		
		add(tableFSMRedux);
		add(new JScrollPane(tableFSMRedux));
		add(buttonCalculate, BorderLayout.SOUTH);
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------
	
	public void initializeTableAlphabet(char[] machineAlphabet) {
		
	}
	
	public void initializeTableStates(char[] machineStates) {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String comando = arg0.getActionCommand( );
        if( comando.equals( CLC_FSM_REDUX ) ) {
        }
	}

	
}
