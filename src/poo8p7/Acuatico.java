/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p7;

/**
 * @author Acosta Durán, Calderón Gómez, González De Luna
 * Class Acuatico: clase que contiene las caracteristicas y funciones del animal acuático
 * extends: obtendrá los datos de la clase Animal
 */
public class Acuatico extends Animal {
    /**
     * numeroAletas: numero de aletas (int)
     */
    private int numeroAletas;

    /**
     * Constructor vacío
     */
    public Acuatico() {
    }

    /**
     * Constructor lleno de Acuatico
     * @param numeroAletas numero de aletas del animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color del animal
     */
    public Acuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color); //constructor de clase superior 
        this.numeroAletas = numeroAletas;
    }

    /**
     * getNumeroAletas obtiene el número de aletas
     * @return el número de aletas
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }

    /**
     * setNumeroAletas modifica el numero de aletas
     * @param numeroAletas 
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    /**
     * Función nadar que indica que ya está nadando
     */
    public void nadar()
    {
        System.out.println("Nadando");
    }
   
    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * Método comer que regresa que ya está comiendo
     */
    @Override
    public void  comer()
    {
        System.out.println("Estoy comiendo peces");
    }

    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * @return Concatenación de atributos
     */
    @Override
    public String toString() {
        return "Acuatico{" + "numeroAletas=" + numeroAletas + " " + super.toString() +'}';
    }

}
