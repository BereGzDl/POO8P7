/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p7;

/**
 * @author Acosta Durán, Calderón Gómez, González De Luna
 * Class Ballena: clase que contiene las caracteristicas y funciones de la ballena
 * extends: obtendrá los datos de la clase Acuatico
 */
public class Ballena extends Acuatico {
    /**
     * largo : el largo del animal ballena (int)
     */
    private int largo;

    /**
     * Constructor vacío
     */
    public Ballena() {
    }

    /**
     * Constructor lleno de Ballena
     * @param largo el largo del animal ballena
     * @param numeroAletas numero de aletas de la ballena
     * @param nombre nombre de la ballena
     * @param lugarOrigen lugar de origen de la ballena
     * @param color color de ballena
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    /**
     * getLargo obtiene el largo de la ballena
     * @return el largo de la ballena
     */
    public int getLargo() {
        return largo;
    }

    /**
     * setLargo modifica el entero largo de la ballena
     * @param largo int del tamaño largo que tiene la ballena
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
  
    /**
     * pelearConPinoccio: Método que realiza la ballena, sonido de cuando lo hace
     */
    public void pelearConPinoccio()
    {
        System.out.println("Pium pium");
    }

    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * @return Concatenación de atributos
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + " " + super.toString() +'}';
    }

    
}
