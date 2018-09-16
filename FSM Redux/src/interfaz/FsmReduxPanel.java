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
	 * Representa el bot�n para crear una nueva m�quina de estado finito reducida
	 */
	private JButton buttonCalcule; 
	
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
		DefaultTableModel modelo = new DefaultTableModel();
		tableFSMRedux = new JTable(modelo);
		buttonCalcule = new JButton("Calcular FSM reducida");
		buttonCalcule.addActionListener(this);
		buttonCalcule.setActionCommand(CLC_FSM_REDUX);
		
		JScrollPane js=new JScrollPane(tableFSMRedux);
		js.setVisible(true);
		add(js);
		
		border.setTitleJustification(TitledBorder.LEFT);
		border.setTitlePosition(TitledBorder.TOP);
		setBorder(border);
		add(tableFSMRedux, BorderLayout.CENTER);
		add(buttonCalcule, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String comando = arg0.getActionCommand( );
        if( comando.equals( CLC_FSM_REDUX ) ) {
        }
	}

	
}
