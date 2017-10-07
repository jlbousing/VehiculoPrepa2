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
public class Carro extends Vehiculo {

    public Carro(String color, int cilindro, String dueno) {
        super(color, cilindro, dueno);
    }


    @Override
    public void setColor(String color) {
        super.setColor(color); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCilindro(int cilindro) {
        super.setCilindro(cilindro); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Mostrar(){
        System.out.println("SOY UN CARRO");
        System.out.println("Color: "+this.color);
        System.out.println("Dueno: "+this.dueno);
    }
}
