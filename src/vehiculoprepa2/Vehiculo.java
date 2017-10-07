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
public abstract class Vehiculo {
    
    protected String color;
    protected int cilindro;
    protected String dueno;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindro() {
        return cilindro;
    }

    public void setCilindro(int cilindro) {
        this.cilindro = cilindro;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    
    public Vehiculo(String color, int cilindro, String dueno){
        
        this.color = color;
        this.cilindro = cilindro;
        this.dueno = dueno;
    }
    
    public abstract void Mostrar();
}
