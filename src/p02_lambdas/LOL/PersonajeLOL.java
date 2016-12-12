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
    private ArrayList<PersonajeLOL> listaLOL;

    private ArrayList<ObjetosLOL> misObjetosLOL;

    public void alta(PersonajeLOL l) {
        listaLOL.add(listaLOL.size(), l);

    }

    public void alta2(ObjetosLOL l) {
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
        this.Vida = 0;
        this.DañoAtaque = 0;
        this.VelocidadAtaque = 0;
        this.VelocidadMovimiento = 0;
        this.RegeneracionVida = 0;
        this.Armadura = 0;
        this.ResistenciaMagica = 0;
        this.Mana = 0;
    }

    public PersonajeLOL() {
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
    public static void crearPersonajes(PersonajeLOL listaLOL) {
        try {
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
     public static void borrarPersonajes(List<PersonajeLOL>listaLOL) {
        int contador = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(listaLOL.size());

        do {
            try {
                for (PersonajeLOL ls : listaLOL) {
                    contador++;
                    System.out.println(contador + " Armadura: " + ls.getArmadura() + " Ataque: " + ls.getDañoAtaque() + " Mana: " + ls.getMana() + " Velocidad Ataque: " + ls.getVelocidadAtaque());
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

                System.out.println("¿Quieres eliminar otro numero asociado a LOL? SI/NO?");
                String seguro2 = br.readLine();
                if (seguro2.equalsIgnoreCase("SI")) {

                    for (PersonajeLOL ls : listaLOL) {
                        contador++;
                        System.out.println(contador + " Armadura: " + ls.getArmadura() + " Ataque: " + ls.getDañoAtaque() + " Mana: " + ls.getMana() + " Velocidad Ataque: " + ls.getVelocidadAtaque());
                    }
                    System.out.println("¿Qué número de LOL deseas eliminar?");
                    int numero2 = Integer.parseInt(br.readLine());
                    System.out.println("Deseas eliminar el número: " + numero2);

                    listaLOL.remove(numero2);

                } else if (seguro2.equalsIgnoreCase("NO")) {
                    System.out.println("Esta vez te has quedado sin eliminar ninguno");
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        } while (true);
    }
    
    public void addObjetoLOL(ObjetosLOL objeto) {

        
        this.Armadura = this.Armadura + objeto.getArmadura();
        this.DañoAtaque = this.DañoAtaque + objeto.getDañoAtaque();
        

    }
    
      public void borrarObjetoLOL(){
          int
        contador = 0;
       for(ObjetosLOL l : misObjetosLOL){
           contador++;
         System.out.println(contador +"Nombre :" +l.getNombre() + " Armadura: " + l.getArmadura() + " Ataque: " + l.getDañoAtaque() + " Mana: " + l.getMana() + " Velocidad Ataque: " + l.getVelocidadAtaque());
           
       }
       int borrarObjeto;
       borrarObjeto = pedirEntero("¿Qué objeto quieres borrar?");
       misObjetosLOL.remove(borrarObjeto);
        
    }
      
 // Añadir Objeto a Personaje Tiene que ejecutarse     
    public void añadirObjetoAPersonaje(){  
        
      int contador = 0;    
        for(PersonajeLOL l : listaLOL){
            contador++;
       System.out.println(contador + " Armadura: " + l.getArmadura() + " Ataque: " + l.getDañoAtaque() + " Mana: " + l.getMana() + " Velocidad Ataque: " + l.getVelocidadAtaque());
        
        }
        int personajeSeleccionado;
        personajeSeleccionado = pedirEntero("¿A cual quieres añadirle un objeto?");
        
        
        contador = 0;
        for(ObjetosLOL l : misObjetosLOL){
            contador++;
            System.out.println(contador +"Nombre :" +l.getNombre() + " Armadura: " + l.getArmadura() + " Ataque: " + l.getDañoAtaque() + " Mana: " + l.getMana() + " Velocidad Ataque: " + l.getVelocidadAtaque());
        }
         int objetoAñadir;
          objetoAñadir = pedirEntero("¿Qué número de objeto quieres añadir?");
listaLOL.get(personajeSeleccionado).addObjetoLOL(misObjetosLOL.get(objetoAñadir));
          

    }
    
 
   

}
