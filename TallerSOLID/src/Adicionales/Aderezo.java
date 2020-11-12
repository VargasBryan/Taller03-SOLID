package Adicionales;

/**
*
* @author Joel Choez
*/

public abstract class Aderezo {
	private String nombre;
	
	public Aderezo(String nombre) {
		this.nombre = nombre;
	}
	
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre.toUpperCase();
	}
}
