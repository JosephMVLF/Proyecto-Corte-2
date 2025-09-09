package co.edu.unbosque.model.persistance;

import java.util.ArrayList;

import co.edu.unbosque.model.Usuario;

public class UsuarioDAO implements DAO<Usuario>{

	private ArrayList<Usuario> listaUsuarios;
	
	public UsuarioDAO() {
		listaUsuarios = new ArrayList<Usuario>();
	}
	
	@Override
	public void crear(Usuario nuevosDatos) {
		listaUsuarios.add(nuevosDatos);
	}

	@Override
	public boolean eliminar(int indice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(int indice, Usuario datosActualizados) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int contar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
