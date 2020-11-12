/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.ArrayList;

import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
	public static void main(String [ ] args){
       
		Aderezo crema = new Crema("crema");
        Aderezo frutilla = new Crema("frutilla");
        LecheEntera leche2 = new LecheDescremada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        //Agregar CREMA y FRUTILLAS
        helado_vainilla.anadirAderezo(crema);
        helado_vainilla.anadirAderezo(frutilla);
        System.out.println(helado_vainilla);
        // y cambiar el tipo de leche por Leche Descremada
        mnj_leche.cambiarTipoLeche(leche2, helado_vainilla);
        // Finalmente mostrar el precio final de cada uno
        System.out.println(ManejadorDePrecio.showPrecioFinal(helado_vainilla));
        
        
    
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        //Agregar CREMA y FRUTILLAS
        pastel_chocolate.anadirAderezo(crema);
        pastel_chocolate.anadirAderezo(frutilla);
        System.out.println(pastel_chocolate);
        // y cambiar el tipo de leche por Leche Descremada
        mnj_leche.cambiarTipoLeche(leche2, pastel_chocolate);
        // Finalmente mostrar el precio final de cada uno
        System.out.println(ManejadorDePrecio.showPrecioFinal(pastel_chocolate));
        

        }
		
}
