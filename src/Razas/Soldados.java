/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import Edificios.factory_edificios;
import Edificios.interfaz_edificios;

/**
 *
 * @author javie
 */
public class Soldados implements interfaz_razas {
    private String nombre;

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public interfaz_edificios construir(String tipo){
        return factory_edificios.getEdificio(tipo);
    }
    
}
