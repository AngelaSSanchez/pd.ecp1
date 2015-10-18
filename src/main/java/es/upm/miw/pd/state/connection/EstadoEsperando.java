package es.upm.miw.pd.state.connection;

public class EstadoEsperando extends EstadoConexion{

	public Estado getEstado(){
		return Estado.ESPERANDO;
	}
	
	public void recibir(Conexion conexion, int respuesta){
        if (respuesta == 0) {
            conexion.setEstado(new EstadoPreparado()); 
        } else {
        	conexion.setEstado(new EstadoCerrado()); 
        }
	}
}
