package es.upm.miw.pd.state.connection;

public class Conexion {
	
    private Link link;
    
    private EstadoConexion estadoconexion;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.setEstado(new EstadoCerrado());
    }

    public Link getLink() {
        return link;
    }
    
    public void setEstado(EstadoConexion estadoconexion){
    	this.estadoconexion = estadoconexion;
    }

    public Estado getEstado() {
        return this.estadoconexion.getEstado();
    }

    public void abrir() {
    	this.estadoconexion.abrir(this);
    }

    public void cerrar() {
    	this.estadoconexion.cerrar(this);
    }

    public void parar() {
    	this.estadoconexion.parar(this);
    }

    public void iniciar() {
    	this.estadoconexion.iniciar(this);
    }

    public void enviar(String msg) {
    	this.estadoconexion.enviar(this,msg);
    }

    public void recibir(int respuesta) {
    	this.estadoconexion.recibir(this,respuesta);
    }

}
