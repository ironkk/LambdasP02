/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas.LOL;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dam
 */
public class ObjetosLOL {
       private int Vida;
    private int DañoAtaque;
    private int VelocidadAtaque;
    private int VelocidadMovimiento;
    private int RegeneracionVida;
    private int Armadura;
    private int ResistenciaMagica;
    private int Mana;
    private String nombre;
    
   private ArrayList<PersonajeLOL> listaLOL;

      private ArrayList<ObjetosLOL> misObjetosLOL;
    public void alta(PersonajeLOL l) {
        listaLOL.add(listaLOL.size(), l);

    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getDañoAtaque() {
        return DañoAtaque;
    }

    public void setDañoAtaque(int DañoAtaque) {
        this.DañoAtaque = DañoAtaque;
    }

    public int getVelocidadAtaque() {
        return VelocidadAtaque;
    }

    public void setVelocidadAtaque(int VelocidadAtaque) {
        this.VelocidadAtaque = VelocidadAtaque;
    }

    public int getVelocidadMovimiento() {
        return VelocidadMovimiento;
    }

    public void setVelocidadMovimiento(int VelocidadMovimiento) {
        this.VelocidadMovimiento = VelocidadMovimiento;
    }

    public int getRegeneracionVida() {
        return RegeneracionVida;
    }

    public void setRegeneracionVida(int RegeneracionVida) {
        this.RegeneracionVida = RegeneracionVida;
    }

    public int getArmadura() {
        return Armadura;
    }

    public void setArmadura(int Armadura) {
        this.Armadura = Armadura;
    }

    public int getResistenciaMagica() {
        return ResistenciaMagica;
    }

    public void setResistenciaMagica(int ResistenciaMagica) {
        this.ResistenciaMagica = ResistenciaMagica;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int Mana) {
        this.Mana = Mana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ObjetosLOL() {
    }

    public ObjetosLOL(int Vida, int DañoAtaque, int VelocidadAtaque, int VelocidadMovimiento, int RegeneracionVida, int Armadura, int ResistenciaMagica, int Mana, String nombre) {
        this.Vida = Vida;
        this.DañoAtaque = DañoAtaque;
        this.VelocidadAtaque = VelocidadAtaque;
        this.VelocidadMovimiento = VelocidadMovimiento;
        this.RegeneracionVida = RegeneracionVida;
        this.Armadura = Armadura;
        this.ResistenciaMagica = ResistenciaMagica;
        this.Mana = Mana;
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.Vida;
        hash = 97 * hash + this.DañoAtaque;
        hash = 97 * hash + this.VelocidadAtaque;
        hash = 97 * hash + this.VelocidadMovimiento;
        hash = 97 * hash + this.RegeneracionVida;
        hash = 97 * hash + this.Armadura;
        hash = 97 * hash + this.ResistenciaMagica;
        hash = 97 * hash + this.Mana;
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final ObjetosLOL other = (ObjetosLOL) obj;
        if (this.Vida != other.Vida) {
            return false;
        }
        if (this.DañoAtaque != other.DañoAtaque) {
            return false;
        }
        if (this.VelocidadAtaque != other.VelocidadAtaque) {
            return false;
        }
        if (this.VelocidadMovimiento != other.VelocidadMovimiento) {
            return false;
        }
        if (this.RegeneracionVida != other.RegeneracionVida) {
            return false;
        }
        if (this.Armadura != other.Armadura) {
            return false;
        }
        if (this.ResistenciaMagica != other.ResistenciaMagica) {
            return false;
        }
        if (this.Mana != other.Mana) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

       public void alta(ObjetosLOL l) {
         misObjetosLOL.add(misObjetosLOL.size(), l);

    }
       
         public boolean modificaVida() {
        if (this.getVida() == 0) {
            return false;

        } else {
            return true;

        }
    }

    public boolean modificaAtaque() {
        if (this.getDañoAtaque() == 0) {
            return false;

        } else {
            return true;

        }
    }

    public boolean modificaMovimiento() {
        if (this.getVelocidadMovimiento() == 0) {
            return false;

        } else {
            return true;

        }
    }

    public boolean modificaVelocidadAtaque() {
        if (this.getVelocidadAtaque() == 0) {
            return false;

        } else {
            return true;

        }
    }

    public boolean modificaRegeneraVida() {
        if (this.getRegeneracionVida() == 0) {
            return false;

        } else {
            return true;

        }
    }

    public boolean modificaArmadura() {
        if (this.getArmadura() == 0) {
            return false;

        } else {
            return true;

        }
    }

    public boolean modificaResistenciaMagica() {
        if (this.getResistenciaMagica() == 0) {
            return false;

        } else {
            return true;

        }
    }

    public boolean modificaMana() {
        if (this.getMana() == 0) {
            return false;

        } else {
            return true;

        }
    }
    @Override
    public String toString() {
        return "ObjetosLOL{" + "Vida=" + Vida + ", Da\u00f1oAtaque=" + DañoAtaque + ", VelocidadAtaque=" + VelocidadAtaque + ", VelocidadMovimiento=" + VelocidadMovimiento + ", RegeneracionVida=" + RegeneracionVida + ", Armadura=" + Armadura + ", ResistenciaMagica=" + ResistenciaMagica + ", Mana=" + Mana + ", nombre=" + nombre + '}';
    }

    
    
}
