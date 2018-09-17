package interfaz;

import java.awt.BorderLayout;
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
	 * Versi�n de serializaci�n
	 */
	private static final long serialVersionUID = -5505572058567690378L;
	
	// -------------------------------------------------------------------------------------------------
	// Constantes
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Representa la acci�n de calcular la versi�n reducida de la m�quina de estados finitos
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
	 * Representa el bot�n para crear una nueva m�quina de estado finito reducida
	 */
	private JButton buttonCalculate; 
	
	/**
	 * Representa la ventana propietaria del panel
	 */
	private MainWindow mainWindow;
	
	public FsmReduxPanel(MainWindow owner) {
		// Propiedades b�sicas
		mainWindow = owner;
		setLayout(new BorderLayout());
		
		// Inicializaci�n de componentes
		TitledBorder border = new TitledBorder("FSM Reducida");
		
		// Tabla
		tableData = new String[0][0];
		header = new String[0];
		tableModel = new DefaultTableModel(tableData, header);
		tableFSMRedux = new JTable(tableModel);
		
		// Bot�n para calcular
		buttonCalculate = new JButton("Calcular FSM reducida");
		buttonCalculate.addActionListener(this);
		buttonCalculate.setActionCommand(CLC_FSM_REDUX);
		
		JScrollPane js=new JScrollPane(tableFSMRedux);
		js.setVisible(true);
		add(js);
		
		border.setTitleJustification(TitledBorder.LEFT);
		border.setTitlePosition(TitledBorder.TOP);
		setBorder(border);
		add(tableFSMRedux, BorderLayout.CENTER);
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
