/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

/**
 *
 * @author javie
 */
public class factory_edificios {
    
    public static interfaz_edificios getEdificio(String opcion){
        switch(opcion){
            case "CENTRODEMANDO":
                return new CentroMando.buildercentro().vida(2000).builder();
        }
        return null;
    } 
    
}
