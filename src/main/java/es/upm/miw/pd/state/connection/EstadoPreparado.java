package es.upm.miw.pd.state.connection;

public class EstadoPreparado extends EstadoConexion{
	
	public Estado getEstado(){
		return Estado.PREPARADO;
	}
	
	public void cerrar(Conexion conexion){
		conexion.setEstado(new EstadoCerrado());
	}
	
	public void abrir(Conexion conexion){
		
	}
	
	public void iniciar(Conexion conexion){
		
	}
	
	public void enviar(Conexion conexion, String msg){
		conexion.getLink().enviar(msg);
		conexion.setEstado(new EstadoEsperando());
	}
	
	public void parar(Conexion conexion){
		conexion.setEstado(new EstadoParado());
	}
	
}