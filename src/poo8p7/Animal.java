/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p7;

/**
 *
 * @author Acosta Durán, Calderón Gómez, González De Luna
 */
public class Animal {
     /**
     * CADENAS (string):
     * nombre: nombre del animal 
     * lugarOrigen: el lugar de origen del animal
     * color: color del animal
     */
    private String nombre, lugarOrigen, color;

    /**
     * Constructor vacío
     */
    public Animal() {
    }

    /**
     * Constructor lleno de Animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    /**
     * getNombre: obtiene el nombre del animal
     * @return el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setNombre modifica el nombre del animal
     * @param nombre nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getLugarOrigen: obtiene el lugar del origen del animal
     * @return el origen del animal
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * setLugarOrigen modifica el lugar de origen del animal
     * @param lugarOrigen lugar de origen del animal
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * getColor: obtiene el color del animal
     * @return el color del animal
     */
    public String getColor() {
        return color;
    }

    /**
     * setColor: modifica el color del animal
     * @param color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * hacerSonido: función que muestra que realiza sonido el animal
     * @param sonido 
     */
    public void hacerSonido(String sonido)
    {
        System.out.println("Sonido: " + sonido);
    }
    
    /**
     * comer: función que muestra que está comiendo el animal 
     */
    public void comer()
    {
        System.out.println("Estoy comiendo ");
    }

    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * @return Concatenación de atributos
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }

    
}
