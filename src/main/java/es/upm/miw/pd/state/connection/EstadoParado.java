package es.upm.miw.pd.state.connection;

public class EstadoParado extends EstadoConexion{

	public Estado getEstado(){
		return Estado.PARADO;
	}
	
	public void parar(Conexion conexion){
		
	}
	
	public void iniciar(Conexion conexion){
		conexion.setEstado(new EstadoPreparado());
	}
}
