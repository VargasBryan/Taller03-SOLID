package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public abstract class Postre {
	protected String sabor;
	protected double precioParcial;
	protected ArrayList<Aderezo> aderezos;
	
	public Postre(String sabor) {
		this.sabor = sabor;
		aderezos = new ArrayList<>();
	}
	
	public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
	
	public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
	
	public String showPrecioFinal() {
		return  "Precio Final: $ " + calcularPrecioFinal();
	}
}
