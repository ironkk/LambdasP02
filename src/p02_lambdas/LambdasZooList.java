/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dam
 */
public class LambdasZooList {
       public static void main(String[] args) {
           Animal marc = new Animal();
         Animal xavi = new Animal();
         Animal cordero = new Animal();
          Animal jon = new Animal();
         
         marc.setNombre("marc");
         marc.setPotNadar(true);
         xavi.setNombre("xavi");
         xavi.setPotVolar(true);
         cordero.setNombre("cordero");
         cordero.setPotSaltar(true);
         jon.setNombre("jon");
         jon.setPotCaminar(true);
         
         
         List<Animal> animals = new ArrayList<>();
         animals.add(xavi);
         animals.add(marc);
         animals.add(cordero);
         animals.add(jon);
         
        CheckTrait lambdaPotCaminar = (Animal a) -> {
            
            System.out.print("pot caminar: ");

            return (a.potCaminar() );
        };
          
         CheckTrait lambdaPotVolar = (Animal a) -> {

              System.out.print("pot volar: ");
            return (a.potVolar());
        };

         CheckTrait lambdaPotNadar = (Animal a) -> {

              System.out.print("pot nadar: ");
            return (a.potNadar());
        };
         
            CheckTrait lambdaPotSaltar = (Animal a) -> {

                 System.out.print("pot saltar: ");
            return (a.potSaltar());
        };
            
           List<CheckTrait> checks = new ArrayList<>();
           checks.add(lambdaPotNadar);
           checks.add(lambdaPotVolar);
           checks.add(lambdaPotSaltar);
           checks.add(lambdaPotCaminar);
           
           showCheckTraits(animals, checks);
            
       }
       
       
       public static void showCheckTraits(List<Animal> animals, List<CheckTrait> checks){
           animals.forEach(animal-> { 
               System.out.println("");
               System.out.println("El animal " + animal.getNombre());
               checks.forEach(check -> System.out.println(check.test(animal)));
           });
    
}
}
