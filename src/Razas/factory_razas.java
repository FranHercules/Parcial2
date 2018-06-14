/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author javie
 */
public class factory_razas {
    public static interfaz_razas getRaza(String opcion){
        switch(opcion){
            case "soldados":
                   return new Soldados();
            case "androides":
                   return new Androides();
            case "aliens":
                   return new Aliens();
            
        }
        return null;
    }
}
