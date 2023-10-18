/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p7;

/**
 *
 * @author Acosta Durán, Calderón Gómez, González De Luna
 * Class Terrestre: clase que contiene las caracteristicas y funciones del animal terrestre
 * extends: obtendrá los datos de la clase Animal
 */
public class Terrestre extends Animal {
    /**
     * numeroAletas: numero de Patas (int)
     */
    private int numeroPatas;

    /**
     * Constructor vacío
     */
    public Terrestre() {
    }

    /**
     * Constructor lleno de Terrestre
     * @param numeroPatass
     * @param nombre
     * @param lugarOrigen
     * @param color 
     */
    public Terrestre(int numeroPatass, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    /**
     * getNumeroPatas obtiene el número de patas
     * @return el número de patas
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * setNumeroPatas modifica el numero de patas
     * @param numeroPatas 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
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
     * Método correr que regresa que ya está corriendo
     */
    //@Override
    public void  correr()
    {
        System.out.println("Corriendo");
    }

    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * @return Concatenación de atributos
     */
    @Override
    public String toString() {
        return "Terrestre{" + "numeroPatas=" + numeroPatas + " " + super.toString() +'}';
    }
    
}
