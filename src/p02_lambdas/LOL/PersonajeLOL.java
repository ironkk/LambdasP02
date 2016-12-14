/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02_lambdas.LOL;

import java.io.BufferedReader;
import java.io.IOException;
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

    private String Nombre;
    private int Vida;
    private int DañoAtaque;
    private int VelocidadAtaque;
    private int VelocidadMovimiento;
    private int RegeneracionVida;
    private int Armadura;
    private int ResistenciaMagica;
    private int Mana;
    private List<PersonajeLOL> listaLOL;
    private List<ObjetosLOL> misObjetosLOL;

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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<PersonajeLOL> getListaLOL() {
        return listaLOL;
    }

    public void setListaLOL(List<PersonajeLOL> listaLOL) {
        this.listaLOL = listaLOL;
    }

    public List<ObjetosLOL> getMisObjetosLOL() {
        return misObjetosLOL;
    }

    public void setMisObjetosLOL(List<ObjetosLOL> misObjetosLOL) {
        this.misObjetosLOL = misObjetosLOL;
    }

    public PersonajeLOL(int Vida, int DañoAtaque, int VelocidadAtaque, int VelocidadMovimiento, int RegeneracionVida, int Armadura, int ResistenciaMagica, int Mana, String nombre) {
        this.Vida = Vida;
        this.DañoAtaque = DañoAtaque;
        this.VelocidadAtaque = VelocidadAtaque;
        this.VelocidadMovimiento = VelocidadMovimiento;
        this.RegeneracionVida = RegeneracionVida;
        this.Armadura = Armadura;
        this.ResistenciaMagica = ResistenciaMagica;
        this.Mana = Mana;
        this.Nombre = Nombre;
        this.misObjetosLOL = misObjetosLOL;
        this.listaLOL = listaLOL;
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
        this.Nombre = "";
        this.misObjetosLOL = new ArrayList<ObjetosLOL>();
        this.listaLOL = new ArrayList<PersonajeLOL>();
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
        return "PersonajeLOL{" + "Nombre=" + Nombre + ", Vida=" + Vida + ", Da\u00f1oAtaque=" + DañoAtaque + ", VelocidadAtaque=" + VelocidadAtaque + ", VelocidadMovimiento=" + VelocidadMovimiento + ", RegeneracionVida=" + RegeneracionVida + ", Armadura=" + Armadura + ", ResistenciaMagica=" + ResistenciaMagica + ", Mana=" + Mana + ", listaLOL=" + listaLOL + ", misObjetosLOL=" + misObjetosLOL + '}';
    }

    /// CREAR PERSONAJE
    public void crearPersonajes() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String respuesta;
            respuesta = pedirCadena("¿Quieres añadir un Personaje? SI/NO");

            if (respuesta.equalsIgnoreCase("SI")) {
                System.out.println("Elige las características de tu objeto de LOL ");

                String nombre = pedirCadena("¿Nombre Personaje?");
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

                PersonajeLOL l = new PersonajeLOL(vida, dañoAtaque, velocidadAtaque, velocidadMovimiento, regeneracionVida, armadura, resistenciaMagica, mana, nombre);
                
                // JAVA NULL POINTER
                
                listaLOL.add(l);

                System.out.println("Personaje Creado y añadadido a la Lista");
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
                // NO SE MUESTRA!
                for (PersonajeLOL l : listaLOL){
                    contador++;
                    System.out.println(contador + "Nombre" + l.toString());
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
        for (ObjetosLOL o : misObjetosLOL) {
            this.Mana += o.getMana();
            this.Vida += o.getVida();
            this.Armadura += o.getArmadura();
            this.DañoAtaque += o.getDañoAtaque();
            this.VelocidadAtaque += o.getVelocidadAtaque();
            this.VelocidadMovimiento += o.getVelocidadMovimiento();
            this.RegeneracionVida += o.getRegeneracionVida();
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

    public void crearObjetoLOL(ObjetosLOL o) {
        misObjetosLOL.add(o);
    }

    public void crearObjetoLOL2() {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String respuesta;
            int contador = 0;
            respuesta = pedirCadena("¿Quieres añadir un Objeto de LOL? SI/NO");

            if (respuesta.equalsIgnoreCase("SI")) {
                System.out.println("Elige las características de tu objeto de LOL ");

                String nombre = pedirCadena("¿Nombre?");

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

                ObjetosLOL l = new ObjetosLOL(vida, dañoAtaque, velocidadAtaque, velocidadMovimiento, regeneracionVida, armadura, resistenciaMagica, mana, nombre);

                misObjetosLOL.add(l);

                System.out.println("Objeto Creado y añadadido a la Lista de Objetos");

                // NO 
                for (PersonajeLOL p : listaLOL) {
                    contador++;
                    System.out.println(contador + "Nombre Personaje" + p.toString());
                }

                System.out.println("¿Qué número de Personaje quieres añadir un Objeto de LOL?");
                int numero = Integer.parseInt(br.readLine());
                System.out.println("Deseas añadir un objeto al: " + numero);
                System.out.println("¿Estas seguro? SI / NO");
                String seguro = br.readLine();
                if (seguro.equalsIgnoreCase("SI")) {
                    for (ObjetosLOL ol : misObjetosLOL) {
                        System.out.println(contador + "Nombre ObjetoLOL" + ol.getNombre());
                    }
                    int numero2 = pedirEntero("¿A qué numero de objeto quieres añadirle a tu personaje?");
                    System.out.println("Deseas añadir el objeto: " + numero2 + "al personaje " + numero);
                    System.out.println("¿Estas seguro? SI / NO");
                    String seguro2 = br.readLine();
                    if (seguro2.equalsIgnoreCase("SI")) {
                        System.out.println("¡Por acabar Lo siento!");

                    }else if(seguro2.equalsIgnoreCase("NO"))
                        System.out.println("pues nada");

                } else if (seguro.equalsIgnoreCase("NO")) {
                    System.out.println("Te has quedado sin añadir un objeto LOL");
                }

            } else {
                System.out.println("Te has creado sin crear un ObjetoLOL");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void borrarObjetoLOL(ObjetosLOL o) {
        for (int i = 0; i < misObjetosLOL.size(); i++) {
            if (misObjetosLOL.get(i).getNombre().equals(o)) {
                misObjetosLOL.remove(i);
            }
        }
    }

    public void borrarObjetoLOL2() {
        int contador = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {

                // JAVA NULL POINTER
                for (ObjetosLOL l : misObjetosLOL) {
                    contador++;
                    System.out.println(contador + "Nombre" + l.getNombre());
                }
                System.out.println("¿Qué número de LOL deseas eliminar?");
                int numero = Integer.parseInt(br.readLine());
                System.out.println("Deseas eliminar el número: " + numero);
                System.out.println("¿Estas seguro? SI / NO");
                String seguro = br.readLine();
                if (seguro.equalsIgnoreCase("SI")) {
                    misObjetosLOL.remove(numero);

                } else if (seguro.equalsIgnoreCase("NO")) {
                    System.out.println("Te has quedado sin eliminar ese objeto");
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();

            }
        } while (true);
    }

    private void remove(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
