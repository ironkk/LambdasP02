/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas.LOL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import p02_lambdas.IreadNumero;
import static p02_lambdas.LOL.Entrada.pedirEntero;

/**
 *
 * @author dam
 */
public class EstadisticasLOL implements checkEstadistica {

    int contador = 0;

    private ArrayList<PersonajeLOL> listaLOL;

      private ArrayList<ObjetosLOL> misObjetosLOL;
      
    public void alta(PersonajeLOL l) {
        listaLOL.add(listaLOL.size(), l);

    }
    
      public void alta2(ObjetosLOL l) {
        misObjetosLOL.add(misObjetosLOL.size(), l);

    }
 

    public EstadisticasLOL() {
        listaLOL = new ArrayList<>();
        
    }

    public ArrayList<PersonajeLOL> getListaLOL() {
        return listaLOL;
    }

    public ArrayList<ObjetosLOL> getMisObjetosLOL() {
        return misObjetosLOL;
    }


    @Override
    public boolean check(ObjetosLOL l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
