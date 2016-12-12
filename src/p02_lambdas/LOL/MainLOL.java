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
public class MainLOL extends EstadisticasLOL {

    private static PersonajeLOL listaLOL = new PersonajeLOL();
    private static ObjetosLOL misObjetosLOL = new ObjetosLOL();

    public static void main(String[] args) {

        // Creamos Array
        List<PersonajeLOL> misLOL = new ArrayList<>(4);

        // Creamos Objetos P
        PersonajeLOL fizz = new PersonajeLOL(8, 5, 22, 18, 2, 7, 9, 9);
        PersonajeLOL aatrox = new PersonajeLOL(10, 2, 15, 34, 22, 14, 2, 3);
        PersonajeLOL azir = new PersonajeLOL(6, 2, 3, 1, 4, 88, 11, 2);
        PersonajeLOL xin = new PersonajeLOL(88, 12, 3, 15, 2, 14, 1, 2);

        // Añadimos Objetos en la Array
        misLOL.add(fizz);
        misLOL.add(aatrox);
        misLOL.add(azir);
        misLOL.add(xin);

        List<ObjetosLOL> objetosLOL = new ArrayList<>();

        ObjetosLOL e1 = new ObjetosLOL(0, 20, 30, 20, 0, 40, 30, 50, "e1");
        ObjetosLOL e2 = new ObjetosLOL(800, 50, 0, 50, 80, 20, 50, 10, "e2");
        ObjetosLOL e3 = new ObjetosLOL(100, 0, 40, 100, 0, 70, 35, 0, "e3");
        ObjetosLOL e4 = new ObjetosLOL(300, 80, 35, 70, 10, 0, 60, 30, "e4");

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

        mostrarDatos(objetosLOL, comprueba);

        switch (mostrarMenu()) {
            case 1:
                CrearyBorrarPersonajes();
                break;
            case 2:
                CrearyBorrarObjetos();
                break;
            case 3:
                misObjetosLOL.borrarObjetoLOL();
                break;
            case 4:
                System.out.println("Adiós!");
                System.exit(0);
                break;

            default:
                System.out.println("Opción incorrecta.");
                System.exit(0);

        }
    }

    private static int mostrarMenu() {
        int opcion = Entrada.pedirEntero("Escoge una opción");
        do {

            System.out.println("*** LOL ***");
            System.out.println("1. Crear o Borrar Personaje LOL");
            System.out.println("2. Crear o Borrar a un Personaje el Objeto LOL");
            System.out.println("3. comprobar");
            System.out.println("4. Salir");

        } while (opcion != 0);
        return opcion;
    }

    
  public static void mostrarDatos(List<ObjetosLOL> objetosLOL, List <checkEstadistica> comprueba) {

        for (ObjetosLOL o : objetosLOL) {
            if ((comprueba.c) == true) {
                System.out.println(o);
            }
        }

    }
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
            PersonajeLOL.crearPersonajes(listaLOL);

        } else if (respuesta.equalsIgnoreCase("BORRAR")) {
            PersonajeLOL.borrarPersonajes((List<PersonajeLOL>) listaLOL);
        }

    }

    public static void CrearyBorrarObjetos() {
        String respuesta = pedirCadena("¿Quieres añadir o borrar un Objeto? Añadir/Borrar");
        if (respuesta.equalsIgnoreCase("AÑADIR")) {

        } else if (respuesta.equalsIgnoreCase("BORRAR")) {

        }

    }
}
 

