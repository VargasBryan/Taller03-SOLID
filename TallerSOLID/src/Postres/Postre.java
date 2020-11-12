package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;
import Procesos.ManejadorDePrecio;

public abstract class Postre {
	protected String sabor;
	protected double precioParcial;
	protected ArrayList<Aderezo> aderezos;
	
	public Postre(String sabor) {
		this.sabor = sabor;
		aderezos = new ArrayList<>();
	}
        
        public double getprecioParcial(){
            return precioParcial;
        }

	
	public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
	
}
