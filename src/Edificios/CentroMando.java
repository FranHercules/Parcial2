/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

import Vehiculos.interfaz_vehiculos;

/**
 *
 * @author javie
 */
public class CentroMando implements interfaz_edificios {
    private int vida;
    
    public CentroMando(buildercentro builder){
        this.vida = builder.vida;
    }
    
    @Override
public interfaz_vehiculos crearVehiculo(String tipo){
    return null;
}
@Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public static class buildercentro{
        private int vida;
        
        public buildercentro vida (int vida){
            this.vida=vida;
            return this;
            
        }
        
        public CentroMando builder(){
            return new CentroMando(this);
        }
    }
}
