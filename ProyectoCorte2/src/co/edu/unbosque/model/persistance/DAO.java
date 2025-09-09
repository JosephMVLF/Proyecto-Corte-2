package co.edu.unbosque.model.persistance;

public interface DAO<E> {
	public void crear(E nuevosDatos);
	public boolean eliminar(int indice);
	public boolean actualizar(int indice, E datosActualizados);
	public String mostrar();
	public int contar();

}
