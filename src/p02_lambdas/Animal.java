/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas;


public class Animal implements CheckTrait{
  
  private boolean potSaltar;
  private boolean potVolar;
  private boolean potNadar;
  private boolean potCaminar;
  private String nombre;

    public Animal(boolean potSaltar, boolean potVolar, boolean potNadar, boolean potCaminar, String nombre) {
        this.potSaltar = potSaltar;
        this.potVolar = potVolar;
        this.potNadar = potNadar;
        this.potCaminar = potCaminar;
        this.nombre = nombre;
    }




    public Animal() {
    }

    public boolean isPotSaltar() {
        return potSaltar;
    }

    public void setPotSaltar(boolean potSaltar) {
        this.potSaltar = potSaltar;
    }

    public boolean isPotVolar() {
        return potVolar;
    }

    public void setPotVolar(boolean potVolar) {
        this.potVolar = potVolar;
    }

    public boolean isPotNadar() {
        return potNadar;
    }

    public void setPotNadar(boolean potNadar) {
        this.potNadar = potNadar;
    }

    public boolean isPotCaminar() {
        return potCaminar;
    }

    public void setPotCaminar(boolean potCaminar) {
        this.potCaminar = potCaminar;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.potSaltar ? 1 : 0);
        hash = 37 * hash + (this.potVolar ? 1 : 0);
        hash = 37 * hash + (this.potNadar ? 1 : 0);
        hash = 37 * hash + (this.potCaminar ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.potSaltar != other.potSaltar) {
            return false;
        }
        if (this.potVolar != other.potVolar) {
            return false;
        }
        if (this.potNadar != other.potNadar) {
            return false;
        }
        if (this.potCaminar != other.potCaminar) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
public boolean potSaltar(){
    return potSaltar;
}

public boolean potVolar(){
    return potVolar;
}

public boolean potNadar(){
    return potNadar;
}

public boolean potCaminar(){
    return potCaminar;
}

    @Override
    public boolean test(Animal a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
}
