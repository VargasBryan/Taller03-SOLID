/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Adicionales.Aderezo;
import Postres.Postre;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class ManejadorDePrecio {
    private static Postre postre;
    
    public ManejadorDePrecio(Postre postre)
    {
        this.postre = postre;
    }
    
     public static double calcularPrecioFinal(Postre postre){
         ArrayList<Aderezo> aderezos = postre.getAderezos();
         double pp = postre.getprecioParcial();
         
         double precioFinal;
         precioFinal=(pp+(pp*0.12))+(aderezos.size()*0.50);
         return precioFinal;
    }
     
     public static String showPrecioFinal(Postre p) {
		return  "Precio Final: $ " + calcularPrecioFinal(p);
	}
    
}
