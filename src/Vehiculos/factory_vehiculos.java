/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author javie
 */
public class factory_vehiculos {
    public static interfaz_vehiculos getVehiculo(String tipo){
        switch(tipo){
            case "VEHICULO_SOLDADO":
                return new Tanque();
           
            case "VEHICULO_ANDROIDE":
                return new Androbuster();
                
            case "VEHICULO_ALIENS":
                return new Spacecraft();
                
        }
        return null;
    }
    
}
