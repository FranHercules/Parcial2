/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author javie
 */
public class factory_milicias {
    public static interfaz_milicias getMilicia(String opcion,String milicia){
        switch(opcion){
            case "soldados":
                switch (milicia){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaEscuadron().nombre("GrageasBertriBott").ataque(10).vida(100).Builder();
                    case "ESPECIALISTA":
                        return new Especialistas.miliciaEspecialista().nombre("CortezaDeArbolVital").ataque(20).vida(50).Builder();
                   
                }
            
            case "androides":
                switch (milicia){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaEscuadron().nombre("GrageasBertriBott").ataque(10).vida(100).Builder();
                    case "ESPECIALISTAS":
                        return new Especialistas.miliciaEspecialista().nombre("CortezaDeArbolVital").ataque(20).vida(50) .Builder();
                    
                }
            
            case "aliens":
                switch (milicia){
                    case "ESCUADRONES":
                        return new Escuadrones.miliciaEscuadron().nombre("GrageasBertriBott").ataque(10).vida(100).Builder();
                    case "ESPECIALISTA":
                        return new Especialistas.miliciaEspecialista().nombre("CortezaDeArbolVital").ataque(20).vida(50).Builder();
                    
                }
        }
        return null;
    }
    
}
