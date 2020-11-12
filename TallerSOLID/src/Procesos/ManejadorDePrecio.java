/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class ManejadorDePrecio {
    
     public double calcularPrecioFinal(double pp, ArrayList<Aderezo> aderezos){
        double precioFinal;
        precioFinal=(pp+(pp*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
    
}
