/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p7;

/**
 *
 * @author Acosta Durán, Calderón Gómez, González De Luna
 * Class Aereo: clase que contiene las caracteristicas y funciones del animal aereo
 * extends: obtendrá los datos de la clase Animal
 */
public class Aereo extends Animal{
    /**
     * numeroAlas: numero de Alas (int)
     */
    private int numeroAlas;

    /**
     * Constructor vacío
     */
    public Aereo() {
    }

    /**
     * Constructor lleno de Aéreo
     * @param numeroAlas
     * @param nombre
     * @param lugarOrigen
     * @param color 
     */
    public Aereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    /**
     * getNumeroAlas obtiene el número de alas
     * @return el número de alas
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }

    /**
     * setNumeroAlas modifica el numero de alas
     * @param numeroAlas 
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * Función comer que indica que ya está comiendo
     */
    public void comer()
    {
        System.out.println("Comiendo");
    }

    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * @return Concatenación de atributos
     */
    @Override
    public String toString() {
        return "Aereo{" + "numeroAlas=" + numeroAlas + " " + super.toString() + '}';
    }
    
    
}
