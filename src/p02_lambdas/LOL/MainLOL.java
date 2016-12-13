/*
< * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas.LOL;

import java.util.ArrayList;
import java.util.List;

import static p02_lambdas.LOL.Entrada.pedirCadena;

/**
 *
 * @author ironkk
 */
public class MainLOL {
    
    private static PersonajeLOL listaLOL = new PersonajeLOL();
    private static PersonajeLOL misObjetosLOL = new PersonajeLOL();
    
    public static void main(String[] args) {

        // Añadimos objetos LOL        
        ObjetosLOL o1 = new ObjetosLOL(0, 20, 30, 20, 10, 40, 30, 50, "o1");
        ObjetosLOL o2 = new ObjetosLOL(800, 50, 0, 30, 80, 20, 50, 50, "o2");
        ObjetosLOL o3 = new ObjetosLOL(100, 0, 40, 500, 0, 70, 35, 67, "o3");
        ObjetosLOL o4 = new ObjetosLOL(300, 80, 35, 20, 10, 0, 60, 30, "o4");
        
       List<ObjetosLOL> objetosLOL = new ArrayList<>();
        objetosLOL.add(o1);
        objetosLOL.add(o2);
        objetosLOL.add(o3);
        objetosLOL.add(o4);

        List<checkEstadistica> comprueba = new ArrayList<>();
        
        checkEstadistica modVida = (l) -> {
            return l.modificaVida();
        };
        checkEstadistica modAtaque = (l) -> {
            return l.modificaAtaque();
        };
        checkEstadistica modMovimiento = (l) -> {
            return l.modificaMovimiento();
        };
        checkEstadistica modRegenera = (l) -> {
            return l.modificaRegeneraVida();
        };
        checkEstadistica modArmadura = (l) -> {
            return l.modificaArmadura();
        };
        checkEstadistica modResistencia = (l) -> {
            return l.modificaResistenciaMagica();
        };
        checkEstadistica modMana = (l) -> {
            return l.modificaMana();
        };
        
        List<PersonajeLOL> misLOL = new ArrayList<>(4);
        
        PersonajeLOL fizz = new PersonajeLOL();
        PersonajeLOL aatrox = new PersonajeLOL();
        PersonajeLOL azir = new PersonajeLOL();
        PersonajeLOL xin = new PersonajeLOL();
        
        misLOL.add(fizz);
        misLOL.add(aatrox);
        misLOL.add(azir);
        misLOL.add(xin);
        
        
        
        // MÉTODO MANUAL
        System.out.println("Fizz");
         System.out.println("Antes de añadir Objeto");
        fizz.calcularEstadisticasPersonaje();
        fizz.crearObjetoLOL(o1);
        fizz.crearObjetoLOL(o2);
        fizz.crearObjetoLOL(o3);
        fizz.crearObjetoLOL(o4);
         System.out.println("Despues de añadir Objeto");
        fizz.calcularEstadisticasPersonaje();
        System.out.println("");
        System.out.println("Aatrox");
        System.out.println("Antes de añadir Objeto");
        aatrox.calcularEstadisticasPersonaje();
        aatrox.crearObjetoLOL(o1);
        aatrox.crearObjetoLOL(o1);
        aatrox.crearObjetoLOL(o1);
        aatrox.crearObjetoLOL(o1);
                System.out.println("Despues de añadir Objeto");
        aatrox.calcularEstadisticasPersonaje();
        System.out.println("");
        System.out.println("Azir");
                System.out.println("Antes de añadir Objeto");
        azir.calcularEstadisticasPersonaje();
        azir.crearObjetoLOL(o1);
        azir.crearObjetoLOL(o1);
        azir.crearObjetoLOL(o1);
        azir.crearObjetoLOL(o1);
                System.out.println("Despues de añadir Objeto");
        azir.calcularEstadisticasPersonaje();
        System.out.println("");
        System.out.println("Xin");
                System.out.println("Antes de añadir Objeto");
        xin.calcularEstadisticasPersonaje();
        xin.crearObjetoLOL(o1);
        xin.crearObjetoLOL(o1);
        xin.crearObjetoLOL(o1);
        xin.crearObjetoLOL(o1);
                System.out.println("Despues de añadir Objeto");
        xin.calcularEstadisticasPersonaje();

        
        switch (mostrarMenu()) {
            case 1:
                CrearyBorrarPersonajes();
                break;
            case 2:
                CrearyBorrarObjetos();
                break;
            case 3:
                System.out.println("Adiós!");
                System.exit(0);
                break;
            
            default:
                System.out.println("Opción incorrecta.");
                System.exit(0);
            
        }
    }
    
    private static int mostrarMenu() {
      int opcion = 0;
        do {
            
            System.out.println("*** LOL ***");
            System.out.println("1. Crear o Borrar Personaje LOL");
            System.out.println("2. Crear o Borrar a un Personaje el Objeto LOL");
            System.out.println("3. Salir");
             opcion = Entrada.pedirEntero("Escoge una opción");
            
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }
    
  /*  public static void mostrarDatos(List<EstadisticasLOL> misObjetosLOL, List<checkEstadistica> comprueba) {
        
        for (EstadisticasLOL o : misObjetosLOL) {
            for (checkEstadistica c : comprueba) {
                if ((c.check(o)) == true) {
                    System.out.println(o);
                }
            }
        }
        
    }
*/

// Java 8 in action pag 70
    @FunctionalInterface
    public interface Predicate<T> {
        
        boolean test(T t);
    }
    
    public static <T> List<PersonajeLOL> filter(List<PersonajeLOL> misLOL, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        
        for (PersonajeLOL s : misLOL) {
            if (p.test((T) s)) {
                results.add((T) s);
            }
        }
        return (List<PersonajeLOL>) results;
    }
    
    public static void CrearyBorrarPersonajes() {
        String respuesta = pedirCadena("¿Quieres añadir o borrar un Personaje? Añadir/Borrar");
        if (respuesta.equalsIgnoreCase("AÑADIR")) {
            listaLOL.crearPersonajes();
            
        } else if (respuesta.equalsIgnoreCase("BORRAR")) {
            listaLOL.borrarPersonajes();
        }
        
    }
    
    public static void CrearyBorrarObjetos() {
        String respuesta = pedirCadena("¿Quieres añadir o borrar un Objeto? Añadir/Borrar");
        if (respuesta.equalsIgnoreCase("AÑADIR")) {
            misObjetosLOL.crearObjetoLOL2();
            
        } else if (respuesta.equalsIgnoreCase("BORRAR")) {
            listaLOL.borrarObjetoLOL2();
        }
        
    }
}
