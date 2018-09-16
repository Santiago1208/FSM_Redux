package interfaz;

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
	
	
	
	// -------------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------------
	
	public MainWindow() {
		
		// Propiedades básicas
		setTitle("FSM Redux");
		setSize(895, 512);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Paneles
		
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
