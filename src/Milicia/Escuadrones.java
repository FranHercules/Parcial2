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
public class Escuadrones implements interfaz_milicias{
    private String nombre;
    private int vida,ataque;
    
    public Escuadrones(miliciaEscuadron Escuadron){
        this.nombre = Escuadron.nombre;
        this.vida = Escuadron.vida;
        this.ataque = Escuadron.ataque;
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque =  ataque;
    }
    
    

    public static class miliciaEscuadron {
        private String nombre;
        private int vida,ataque;
        
        public miliciaEscuadron nombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        
        public miliciaEscuadron vida(int vida){
            this.vida = vida;
            return this;
        }

        public miliciaEscuadron ataque(int ataque){
            this.ataque = ataque;
            return this;
        }
        
        public Escuadrones Escuadron(){
        return new Escuadrones(this);
        }
    }
}
