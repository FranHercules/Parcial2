/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Razas.factory_razas;
import Razas.interfaz_razas;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Principal {
    
    private static Principal creador;

    private Principal() {
    }
    //Patron Singlenton
    public static Principal getInstance() {
        if (creador == null) {
            creador = new Principal();
        }

        return creador;
    }

    public void opcionesDeJugada() {
        System.out.println("\t\t--------- FranHercule'sWorld ----------");
        System.out.println("\t\t1. Construir Edificios.");
        System.out.println("\t\t2. Entrenar Milicias");
        System.out.println("\t\t3. Crear vehiculos");
        System.out.println("\t\t4. Pasar de turno.");
        System.out.println("\t\t5. SALIR");
    }
    
    public void menuRazas(){
        System.out.println("--------- FranHercule'sWorld ----------");
        System.out.println("\t\t1. Soldados");
        System.out.println("\t\t2. Androides");
        System.out.println("\t\t3. Aliens");
    }
    
    public void Bienvenida(){
       System.out.println("--------- FranHercule'sWorld ----------");
       System.out.println("\nBienvenidos guerreros"
               + "\nLas guerras entre diferentes seres son mas complejas de lo que parecen"
               + "\nEnfrentate y descubre que guerreros son los que deben dominar");
    }
    
    public interfaz_razas getraza(){
        int opcionRaza = 4;
        Scanner read = new Scanner(System.in);
        
        while(opcionRaza!=3){
            menuRazas();
        
            try {
                System.out.print("\tOpcion a elegir: ");
                opcionRaza = read.nextInt();
                switch (opcionRaza){
                    case 1:
                        return factory_razas.getRaza("Soldados");
                        
                    case 2:
                        return factory_razas.getRaza("Androides");
                        
                    case 3:
                        return factory_razas.getRaza("Aliens");
                        
                    default:
                        System.out.println("\t\t---------- PROGRAMA FINALIZADO ----------");
                        break;
                }
                
            }catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número ");
                read.nextLine();
            }
        }
        return null;
    }
    
    
    public void menuFases(Usuario usuario) {
        int opcion =5;
        boolean bandera=true;
        Scanner leer = new Scanner(System.in);
        while (bandera==true) {
            opcionesDeJugada();
            try {
                System.out.print("\tOpcion a elegir: ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Aun no agrego el metodo que va aqui");
                        break;
                    case 2:
                            System.out.println("Aun no agrego el metodo que va aqui");
                        break;
                    case 3:
                        bandera=false;
                   
                        break;
                    default:
                        System.err.println("Opción inválida. Intente de nuevo. ");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un número.");
                leer.nextLine();
            }
        }

    }
    
    public  void mostrar() {
        Fase fase = new Fase();
        Bienvenida();
        fase.usuarios.add(new Usuario());
        fase.usuarios.add(new Usuario());
        System.out.println("\nIngrese nombre del Jugador 1: ");
        Scanner leer = new Scanner(System.in);
        fase.usuarios.get(0).setNombre(leer.nextLine());
        System.out.println("Ingrese nombre del Jugador 2: ");
        fase.usuarios.get(1).setNombre(leer.nextLine());
        System.out.println("\nSelecciona una raza Jugador 1");
        while (fase.usuarios.get(0).getRaza() == null) {
            fase.usuarios.get(0).setRaza(getraza());
        }

        System.out.println("\nSelecciona una raza Jugador 2");
        while (fase.usuarios.get(1).getRaza() == null) {
            fase.usuarios.get(1).setRaza(getraza());
        }
        fase.usuarios.get(0).edificios.add(fase.usuarios.get(0).getRaza().
                construir("CENTROMANDO"));
        fase.usuarios.get(1).edificios.add(fase.usuarios.get(1).getRaza().
                construir("CENTROMANDO"));
        Random o = new Random();
        int n = o.nextInt(2);
        int y;
        if (n == 0) {
            y = 1;
        } else {
            y = 0;
        }
        System.out.println(fase.usuarios.get(0).edificios.size());
        
        System.out.println("***************A JUGAR***************");
       
            System.out.println("                                 Fase "+fase.numfase);
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(n+1));
            menuFases(fase.usuarios.get(n));
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(y+1));
            menuFases(fase.usuarios.get(y));
            fase.numfase++;
        
    }
    
}
