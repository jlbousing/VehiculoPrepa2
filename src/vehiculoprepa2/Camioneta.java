/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehiculoprepa2;

/**
 *
 * @author Jorge
 */
public class Camioneta extends Vehiculo{

    public Camioneta(String color, int cilindro, String dueno) {
        super(color, cilindro, dueno);
    }
    
    public void Mostrar(){
        System.out.println("SOY UNA CAMIONETA");
        System.out.println("Color: "+this.color);
        System.out.println("Dueno: "+this.dueno);
    }
    
    
    
}
