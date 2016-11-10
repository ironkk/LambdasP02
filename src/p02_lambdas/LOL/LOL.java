/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas.LOL;

/**
 *
 * @author dam
 */
public class LOL{

    private int Vida;
    private int DañoAtaque;
    private int VelocidadAtaque;
    private int VelocidadMovimiento;
    private int RegeneracionVida;
    private int Armadura;
    private int ResistenciaMagica;
    private int Mana;

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

    public LOL(int Vida, int DañoAtaque, int VelocidadAtaque, int VelocidadMovimiento, int RegeneracionVida, int Armadura, int ResistenciaMagica, int Mana) {
        this.Vida = 0;
        this.DañoAtaque = 0;
        this.VelocidadAtaque = 0;
        this.VelocidadMovimiento = 0;
        this.RegeneracionVida = 0;
        this.Armadura = 0;
        this.ResistenciaMagica = 0;
        this.Mana = 0;
    }

    public LOL() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.Vida;
        hash = 97 * hash + this.DañoAtaque;
        hash = 97 * hash + this.VelocidadAtaque;
        hash = 97 * hash + this.VelocidadMovimiento;
        hash = 97 * hash + this.RegeneracionVida;
        hash = 97 * hash + this.Armadura;
        hash = 97 * hash + this.ResistenciaMagica;
        hash = 97 * hash + this.Mana;
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
        final LOL other = (LOL) obj;
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
        return true;
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
            return false;

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
        return "LOL{" + "Vida=" + Vida + ", Da\u00f1oAtaque=" + DañoAtaque + ", VelocidadAtaque=" + VelocidadAtaque + ", VelocidadMovimiento=" + VelocidadMovimiento + ", RegeneracionVida=" + RegeneracionVida + ", Armadura=" + Armadura + ", ResistenciaMagica=" + ResistenciaMagica + ", Mana=" + Mana + '}';
    }

 

}
