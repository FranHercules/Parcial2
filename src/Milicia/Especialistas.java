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
public class Especialistas implements interfaz_milicias{
    private String nombre;
    private int vida,ataque;
    
    public Especialistas(miliciaEspecialista Especialista){
        this.nombre = Especialista.nombre;
        this.vida = Especialista.vida;
        this.ataque = Especialista.ataque;
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
    
    

    public static class miliciaEspecialista {
        private String nombre;
        private int vida,ataque;
        
        public miliciaEspecialista nombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        
        public miliciaEspecialista vida(int vida){
            this.vida = vida;
            return this;
        }

        public miliciaEspecialista ataque(int ataque){
            this.ataque = ataque;
            return this;
        }
        
        public Especialistas Escuadron(){
        return new Especialistas(this);
        }
    }
}
