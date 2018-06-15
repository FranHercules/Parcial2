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
public interface interfaz_edificios {
    public interfaz_vehiculos crearVehiculo(String tipo);
    
    public int getVida();
    public void setVida(int vida);
    
}
