/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dam
 */
public class EjemploLambdas {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ITallaString tallar = (palabra) -> {
            return palabra.substring(0, 3);

        };

        String t = tallar.tallaString("salchipapa");
        System.out.println(t);

        IsumaNumero sumar = (numero1, numero2) -> {

            return (numero1 + numero2);
        };

        int resultado = sumar.sumaNumbers(1, 8);
        System.out.println(resultado);

        IreadNumero leer = (numero3) -> {
            do {
                try {
                    System.out.println("Numero ?");

                    int numero = Integer.parseInt(br.readLine());
                    return numero;
                } catch (Exception e) {
                    System.out.println(e);
                }

            } while (true);

        };

    }

}
