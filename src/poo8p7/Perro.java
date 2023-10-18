/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p7;

/**
 *
 * @author Acosta Durán, Calderón Gómez, González De Luna
 * Class Perro: clase que contiene las caracteristicas y funciones de perro
 * extends: obtendrá los datos de la clase Terrestre
 */
public class Perro extends Terrestre {
    /**
     * colorCollar : el color del collar del animal perro (String)
     */
    private String colorCollar;

    /**
     * Constructor vacío
     */
    public Perro() {
    }

    /**
     * Constructor lleno de perro
     * @param colorCollar color del collar
     * @param numeroPatas numero de patas
     * @param nombre nombre del perro
     * @param lugarOrigen lugar de origen del perro
     * @param color del perro
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    /**
     * getColorCollar obtiene el color del collar
     * @return color del collar
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * setColorCollar modifica el color del collar
     * @param colorCollar cadena del color del collar
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Método hacerTrucos muestra el truco que realiza
     */
    public void hacerTrucos()
    {
        System.out.println("El muertito");
    }

    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * @return Concatenación de atributos
     */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + " " + super.toString() + '}';
    }
    
}
