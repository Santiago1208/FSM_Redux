package interfaz;

import java.awt.GridLayout;

import javax.swing.JFrame;

import mundo.FSM_Redux;

public class MainWindow extends JFrame {

	/**
	 * Versión de serialización.
	 */
	private static final long serialVersionUID = -5576335749205213128L;
	
	// -------------------------------------------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------------------------------------------
	
	/**
	 * Relación con la controladora del modelo
	 */
	private FSM_Redux fsmRedux;
	
	private NewFsmPanel NFP;
	
	private FsmReduxPanel FRP;
	
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	public MainWindow() {
		
		// Propiedades básicas
		setTitle("FSM Redux");
		//895
		setSize(740, 290);
		setLayout(new GridLayout(1,2));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Paneles
		NFP = new NewFsmPanel(this);
		FRP = new FsmReduxPanel(this);
		
		this.add(NFP);
		this.add(FRP);
//		pack();
	}
	
	// -------------------------------------------------------------------------------------------------
	// Servicios
	// -------------------------------------------------------------------------------------------------

	
	
	public static void main(String[] args) {
		MainWindow mainWindow = new MainWindow();
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);
	}

}
