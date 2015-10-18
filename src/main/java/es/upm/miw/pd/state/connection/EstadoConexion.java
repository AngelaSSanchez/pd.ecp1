package es.upm.miw.pd.state.connection;

public abstract class EstadoConexion {
	
	public Estado getEstado(){
		return getEstado();
	}
	
	public void abrir(Conexion conexion){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
	public void cerrar(Conexion conexion){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
	public void parar(Conexion conexion){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
	public void iniciar(Conexion conexion){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
	public void enviar(Conexion conexion, String msg){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
	public void recibir(Conexion conexion, int respuesta){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
}
