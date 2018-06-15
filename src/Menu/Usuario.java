/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Edificios.interfaz_edificios;
import Razas.interfaz_razas;
import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Usuario {
    private String Nombre;
    public ArrayList<interfaz_edificios> edificios;
    private interfaz_razas raza;
    
    public Usuario() {
    edificios = new ArrayList<>();
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public interfaz_razas getRaza() {
        return raza;
    }

    public void setRaza(interfaz_razas raza) {
        this.raza = raza;
    }
}
