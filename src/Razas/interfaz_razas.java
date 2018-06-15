/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import Edificios.interfaz_edificios;

/**
 *
 * @author javie
 */
public interface interfaz_razas {
    
    public interfaz_edificios construir(String tipo);
    
    public String getNombre();
    
    public void setNombre(String nombre);
    
    
}
