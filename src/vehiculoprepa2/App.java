/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehiculoprepa2;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class App {
    
    private Vehiculo[] vecVehiculo = new Vehiculo[2];

    public Vehiculo[] getVecVehiculo() {
        return vecVehiculo;
    }

    public void setVecVehiculo(Vehiculo[] vecVehiculo) {
        this.vecVehiculo = vecVehiculo;
    }
    
    public App(){
        //CONSTRUCTOR VACIO
       this.AnadirElemento();
        
        Mostrar();
        
    }
    
    
    public void Mostrar(){
        for (int i = 0; i < vecVehiculo.length; i++) {
            
            vecVehiculo[i].Mostrar();
            
            if(vecVehiculo[i] instanceof Camioneta){
                
                //SE APLICA UN CASTEO
                Camioneta c = (Camioneta) vecVehiculo[i];
                c.Rustiquear(); //SE LLAMA AL MÉTODO RUSTIQUEAR QUE SOLO ESTA EN CAMIONETA
            }
        }
    }
    
    public void AnadirElemento(){
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vecVehiculo.length; i++) {
            
            System.out.println("Ingrese el color ");
            String color = sc.next();
            System.out.println("Ingrese el cilindro");
            int cilindro = sc.nextInt();
            System.out.println("Ingrese el nombre del dueno");
            String dueno = sc.next();
            
            System.out.println("Ingrese (1) Carro, (2) Camioneta");
            int tipo = sc.nextInt();
            
            if(tipo == 1){
                vecVehiculo[i] = new Carro(color,cilindro,dueno);
 
            }else{
                vecVehiculo[i] = new Camioneta(color,cilindro,dueno);
            }
            
        }
    }
}
