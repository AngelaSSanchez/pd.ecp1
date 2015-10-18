package es.upm.miw.pd.state.connection;

public class EstadoCerrado extends EstadoConexion{
	
	public Estado getEstado(){
		return Estado.CERRADO;
	}
	
	public void cerrar(Conexion conexion){
		
	}
	
	public void abrir(Conexion conexion){
		conexion.setEstado(new EstadoPreparado());
	}
}
