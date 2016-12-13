/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas.LOL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static p02_lambdas.LOL.Entrada.pedirCadena;
import static p02_lambdas.LOL.Entrada.pedirEntero;

/**
 *
 * @author dam
 */
public class PersonajeLOL {

    private int Vida;
    private int DañoAtaque;
    private int VelocidadAtaque;
    private int VelocidadMovimiento;
    private int RegeneracionVida;
    private int Armadura;
    private int ResistenciaMagica;
    private int Mana;
    private List<PersonajeLOL> listaLOL;
    private List<EstadisticasLOL> misObjetosLOL;

    public void alta(PersonajeLOL l) {
        listaLOL.add(listaLOL.size(), l);

    }

    public void alta2(EstadisticasLOL l) {
        misObjetosLOL.add(misObjetosLOL.size(), l);

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

    public PersonajeLOL(int Vida, int DañoAtaque, int VelocidadAtaque, int VelocidadMovimiento, int RegeneracionVida, int Armadura, int ResistenciaMagica, int Mana) {
        this.Vida = Vida;
        this.DañoAtaque = DañoAtaque;
        this.VelocidadAtaque = VelocidadAtaque;
        this.VelocidadMovimiento = VelocidadMovimiento;
        this.RegeneracionVida = RegeneracionVida;
        this.Armadura = Armadura;
        this.ResistenciaMagica = ResistenciaMagica;
        this.Mana = Mana;
        this.misObjetosLOL = misObjetosLOL;
    }


    public PersonajeLOL() {
        this.Vida = 0;
        this.DañoAtaque = 0;
        this.VelocidadAtaque = 0;
        this.VelocidadMovimiento = 0;
        this.RegeneracionVida = 0;
        this.Armadura = 0;
        this.ResistenciaMagica = 0;
        this.Mana = 0;
        this.misObjetosLOL = new ArrayList<EstadisticasLOL>();
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
        final PersonajeLOL other = (PersonajeLOL) obj;
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

    @Override
    public String toString() {
        return "LOL{" + "Vida=" + Vida + ", Da\u00f1oAtaque=" + DañoAtaque + ", VelocidadAtaque=" + VelocidadAtaque + ", VelocidadMovimiento=" + VelocidadMovimiento + ", RegeneracionVida=" + RegeneracionVida + ", Armadura=" + Armadura + ", ResistenciaMagica=" + ResistenciaMagica + ", Mana=" + Mana + '}';
    }

    /// CREAR PERSONAJE
    public void crearPersonajes(PersonajeLOL listaLOL) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String respuesta;
            respuesta = pedirCadena("¿Quieres añadir un Personaje? SI/NO");

            if (respuesta.equalsIgnoreCase("SI")) {
                System.out.println("Elige las características de tu objeto de LOL ");
                int vida;
                vida = pedirEntero("¿Vida?");

                int dañoAtaque;
                dañoAtaque = pedirEntero("¿Daño Ataque?");

                int velocidadAtaque;
                velocidadAtaque = pedirEntero("¿velocidad de Ataque?");

                int velocidadMovimiento;
                velocidadMovimiento = pedirEntero("¿velocidad de Movimiento");

                int regeneracionVida;
                regeneracionVida = pedirEntero("¿Regeneracion Vida?");

                int armadura;
                armadura = pedirEntero("¿Armadura?");

                int resistenciaMagica;
                resistenciaMagica = pedirEntero("¿Resistencia Magica?");

                int mana;
                mana = pedirEntero("¿Mana?");
                
                PersonajeLOL l = new PersonajeLOL(vida, dañoAtaque, velocidadAtaque, velocidadMovimiento, regeneracionVida, armadura, resistenciaMagica, mana);

                listaLOL.alta(l);

                System.out.println("Personaje Creado y añadadido a la Lista");

                // añadir objeto a un personaje determinado
            } else {
                System.out.println("Te has creado sin crear un personaje");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // BORRAR PERSONAJE
    public void borrarPersonajes() {
        int contador = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {
                 for (int i = 0; i < listaLOL.size(); i++) {
                    contador++;
                    System.out.println(contador +  "" + listaLOL.toString());
                }
                System.out.println("¿Qué número de LOL deseas eliminar?");
                int numero = Integer.parseInt(br.readLine());
                System.out.println("Deseas eliminar el número: " + numero);
                System.out.println("¿Estas seguro? SI / NO");
                String seguro = br.readLine();
                if (seguro.equalsIgnoreCase("SI")) {
                    listaLOL.remove(numero);

                } else if (seguro.equalsIgnoreCase("NO")) {
                    System.out.println("Te has quedado sin eliminar ese numero");
                }
            } catch (Exception e) {
                System.out.println(e);

            }
        } while (true);
    }

  public void calcularEstadisticasPersonaje() {
        for (EstadisticasLOL o : misObjetosLOL) {
            this.Mana += o.getMana();
            this.Vida += o.getVida();
            this.Armadura += o.getArmadura();
            this.DañoAtaque += o.getAtaque();
            this.VelocidadAtaque += o.getVelocidadAtaque();
            this.VelocidadMovimiento += o.getVelocidadMovimiento();
            this.RegeneracionVida += o.getRegeneracionDeVida();

            this.ResistenciaMagica += o.getResistenciaMagica();

        }
        System.out.println("Mana: " + this.Mana);
        System.out.println("Vida: " + this.Vida);
        System.out.println("Armadura: " + this.Armadura);
        System.out.println("Ataque: " + this.DañoAtaque);
        System.out.println("Velocidad ataque: " + this.VelocidadAtaque);
        System.out.println("Velocidad Movimiento: " + this.VelocidadMovimiento);
        System.out.println("Regeneracion de vida: " + this.RegeneracionVida);

        System.out.println("Resistencia Magica: " + this.ResistenciaMagica);

    }
  
    public void crearObjetoLOL(EstadisticasLOL o) {
        misObjetosLOL.add(o);
    }

    
    public void borrarObjetoLOL(EstadisticasLOL o){
        for (int i = 0; i < misObjetosLOL.size(); i++) {
            if (misObjetosLOL.get(i).getNombre().equals(o.getNombre())){
                misObjetosLOL.remove(i);
            }
        }
    }

    private void remove(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
