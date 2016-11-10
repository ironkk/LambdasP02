/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas;

import java.util.List;

/**
 *
 * @author dam
 */
public class LambdasZoo {
     public static void main(String[] args) {
         Animal marc = new Animal();
         Animal xavi = new Animal();
         Animal cordero = new Animal();
         
        CheckTrait lambdaPotCaminar = (Animal a) -> {

            return (a.potCaminar() );
        };
          
         CheckTrait lambdaPotVolar = (Animal a) -> {

            return (a.potVolar());
        };

         CheckTrait lambdaPotNadar = (Animal a) -> {

            return (a.potNadar());
        };
         
            CheckTrait lambdaPotSaltar = (Animal a) -> {

            return (a.potSaltar());
        };
         

            System.out.println(lambdaPotCaminar.test(marc));
            System.out.println(lambdaPotVolar.test(marc));
            System.out.println(lambdaPotNadar.test(marc));
            System.out.println(lambdaPotSaltar.test(marc));
            
           System.out.println(lambdaPotCaminar.test(xavi));
            System.out.println(lambdaPotVolar.test(xavi));
            System.out.println(lambdaPotNadar.test(xavi));
            System.out.println(lambdaPotSaltar.test(xavi));
            
             System.out.println(lambdaPotCaminar.test(cordero));
            System.out.println(lambdaPotVolar.test(cordero));
            System.out.println(lambdaPotNadar.test(cordero));
            System.out.println(lambdaPotSaltar.test(cordero));
            
            
            
   
         
         
         
         
     }  
}
