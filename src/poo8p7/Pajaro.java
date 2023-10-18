/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p7;

/**
 *
 * @author Acosta Durán, Calderón Gómez, González De Luna
 * Class Pajaro: clase que contiene las caracteristicas y funciones de pajaro
 * extends: obtendrá los datos de la clase Aerep
 */
public class Pajaro extends Aereo {
    /**
     * tipoPico : el tipo de pico del animal pajaro (String)
     */
    private String tipoPico;

    /**
     * Constructor vacío
     */
    public Pajaro() {
    }

    /**
     * Constructor lleno de pajaro
     * @param tipoPico
     * @param numeroAlas
     * @param nombre
     * @param lugarOrigen
     * @param color 
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    /**
     * getTipoPico obtiene el tipo del pico
     * @return tipo de pico
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * setTipoPico modifica el tipo del pico
     * @param tipoPico cadena del tipo de pico
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
     * Método recolectarRamas muestra que recoge ramas
     */
    public void recolectarRamas()
    {
        System.out.println("Recogiendo ramas");
    }

    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * @return Concatenación de atributos
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + " " + super.toString() + '}';
    }
    
    
    
}
