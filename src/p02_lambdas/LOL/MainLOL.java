/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas.LOL;

import java.util.ArrayList;
import java.util.List;
import p02_lambdas.Animal;
import p02_lambdas.CheckTrait;
import static p02_lambdas.LambdasZooList.showCheckTraits;

/**
 *
 * @author dam
 */
public class MainLOL {

    public static void main(String[] args) {

        // Creamos Array
        List<LOL> misLOL = new ArrayList<>(4);

        // Creamos Objetos
        LOL fizz = new LOL(8, 5, 22, 18, 2, 7, 9, 9);
        LOL aatrox = new LOL(10, 2, 15, 34, 22, 14, 2, 3);
        LOL azir = new LOL(6, 2, 3, 1, 4, 88, 11, 2);
        LOL xin = new LOL(88, 12, 3, 15, 2, 14, 1, 2);

        // Añadimos Objetos en la Array
        misLOL.add(fizz);
        misLOL.add(aatrox);
        misLOL.add(azir);
        misLOL.add(xin);

        //Lambdas
        checkEstadistica lambdaModificaVida = (LOL l) -> {

            return l.modificaVida();
        };

        checkEstadistica lambdaModificaDaño = (LOL l) -> {

            return l.modificaAtaque();
        };

        checkEstadistica lambdaModificaVelocidadAtaque = (LOL l) -> {

            return l.modificaVelocidadAtaque();
        };

        checkEstadistica lambdaModificaVelocidadMovimiento = (LOL l) -> {

            return l.modificaMovimiento();
        };

        checkEstadistica lambdaModificaRegeneracionVida = (LOL l) -> {

            return l.modificaRegeneraVida();
        };

        checkEstadistica lambdaModificaArmadura = (LOL l) -> {

            return l.modificaArmadura();
        };

        checkEstadistica lambdaModificaResistenciaMágica = (LOL l) -> {

            return l.modificaResistenciaMagica();
        };

        checkEstadistica lambdaModificaMana = (LOL l) -> {

            return l.modificaMana();
        };

        // Lista de la interfaz
        List<checkEstadistica> checks = new ArrayList<>();
        checks.add(lambdaModificaVida);
        checks.add(lambdaModificaArmadura);
        checks.add(lambdaModificaResistenciaMágica);
        checks.add(lambdaModificaMana);
        checks.add(lambdaModificaVelocidadMovimiento);
        checks.add(lambdaModificaVelocidadAtaque);
        checks.add(lambdaModificaDaño);

        showComprueba(misLOL, checks);

    }

    /*   private int Vida;
    private int DañoAtaque;
    private int VelocidadAtaque;
    private int VelocidadMovimiento;
    private int RegeneracionVida;
    private int Armadura;
    private int ResistenciaMagica;
    private int Mana;
     */
    public static void showComprueba(List<LOL> misLOL, List<checkEstadistica> checks) {
        misLOL.forEach(lol -> {
            checks.forEach(check -> System.out.println(check.comprueba(lol)));

        });

        try {
            System.out.println("¿Quieres añadir un personaje de LOL?");
            String respuesta = "";
            if (respuesta.equalsIgnoreCase("SI")) {
                System.out.println("¿Nombre?");
                System.out.println("¿Daño Ataque?");
                System.out.println("¿Velocidad Ataque?");
                System.out.println("¿Velocidad Movimiento?");
                System.out.println("Regeneracion Vida?");
                System.out.println("¿Armadura?");
                System.out.println("¿Resistencia Magica?");
                System.out.println("¿Mana?");
                
                

            } else {

            }

            System.out.println("¿Quieres borrar un personaje de LOL?");

        } catch (Exception e) {
            System.out.println(e);
        }
        /*
   	Permeti que l’usuari es pugui afegir i treure objectes
	Permeti que l’usuari pugui veure les seves estadístiques segons els objectes equipats.
         */

    }

}
