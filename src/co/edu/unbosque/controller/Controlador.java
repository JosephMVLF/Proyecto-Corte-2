package co.edu.unbosque.controller;

import java.util.ArrayList;

public class Controlador {

	private StartupWindow sWin;
	
	public Controlador() {
		sWin = new StartupWindow();
	}
	
	public void run(){
		
	}
	public void runGUI() {
		sWin.setVisible(true);
	}

	public void asignarListeners() {
		// Botón iniciar sesión
		sWin.getBtnIniciarSesion().addActionListener(this);
		sWin.getBtnIniciarSesion().setActionCommand("INICIAR_SESION");

		// Botón registrar
		sWin.getBtnRegistrar().addActionListener(this);
		sWin.getBtnRegistrar().setActionCommand("REGISTRAR");

		// ComboBox idioma
		sWin.getCmbIdioma().addActionListener(this);
		sWin.getCmbIdioma().setActionCommand("IDIOMA");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();

		switch (alias) {
		case "INICIAR_SESION":

			break;

		case "REGISTRAR":

			break;

		case "IDIOMA":

			break;
		}
	}

	
	public boolean verificarContraseniaUsuario(String contrasenia, ArrayList<String> listaContrasenias) {
	return true;
	}
	public boolean verificarNombreUsuario(int nombre, ArrayList<Integer> listaNombres) {
		return true;
	}
}

