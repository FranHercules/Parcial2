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
        System.out.println("\t\t********** KarichaLobato`sWorld **********");
        System.out.println("\t\t1. Construir Edificios.");
        System.out.println("\t\t2. Ver dificios disponibles para acciones.");
        System.out.println("\t\t3. Crear milicias");
        System.out.println("\t\t4. Entrenar Milicias");
        System.out.println("\t\t5. Curar Milicias");
        System.out.println("\t\t6. Crear vehiculos");
        System.out.println("\t\t7. Ver recursos disponibles");
        System.out.println("\t\t8. Pasar de turno.");
        System.out.println("\t\t9. SALIR");
    }
    
    public void menuRazas(){
        System.out.println("********** KarichaLobato`sWorld **********");
        System.out.println("\t\t1. Gryffindor");
        System.out.println("\t\t2. Slytherin");
        System.out.println("\t\t3. Ravenclow");
    }
    
    public void Bienvenida(){
       System.out.println("********** KarichaLobato`sWorld **********");
       System.out.println("\nBienvenidos a este mundo en el cual podrás experimentar"
               + "\nla magía de poder jugar en contra de las  otras casas, que siempre has querido"
               + "\ntenfrentarte en las peliculas de Harry Potter,pero conotra versión de la saga.");
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
                        return factory_razas.getRaza("GRYFFINDOR");
                        
                    case 2:
                        return factory_razas.getRaza("RAVENCLOW");
                        
                    case 3:
                        return factory_razas.getRaza("SLYTHRIN");
                        
                    default:
                        System.out.println("\t\t********** PROGRAMA FINALIZADO **********");
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
        System.out.println("\nIngrese nombre del primer Jugador: ");
        Scanner leer = new Scanner(System.in);
        fase.usuarios.get(0).setNombre(leer.nextLine());
        System.out.println("Ingrese nombre del segundo Jugador: ");
        fase.usuarios.get(1).setNombre(leer.nextLine());
        System.out.println("Elegi tu raza Jugador 1");
        while (fase.usuarios.get(0).getRaza() == null) {
            fase.usuarios.get(0).setRaza(getraza());
        }

        System.out.println("Elegi tu raza Jugador 2");
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
       
            System.out.println("Inicia Fase "+fase.numfase);
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(n+1));
            menuFases(fase.usuarios.get(n));
            System.out.println("------------------------");
            System.out.println("Turno de jugador"+(y+1));
            menuFases(fase.usuarios.get(y));
            fase.numfase++;
        
    }
    
}
