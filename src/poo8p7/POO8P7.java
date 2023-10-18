/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo8p7;

/**
 *
 * @author Acosta Durán, Calderón Gómez, González De Luna
 */
public class POO8P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        
        //=========ANIMAL=========
        System.out.println("===== ANIMAL =====\n");
        
        /**
         * Crea constructor para animal
         */
        Animal animal = new Animal();
        /**
         * Obtiene y modifica los atributos de animal
         */
        animal.setNombre("X");
        animal.setLugarOrigen("X");
        animal.setColor("X");        
        /**
         * Imprime lo que contiene toString de animal
         */
        //System.out.println(animal.toString());  
        
        System.out.println("----- ACUATICO -----\n");
        
        //=========ACUATICO=========
        /**
         * Crea constructor para acuatico
         */
        Acuatico acuatico = new Acuatico();
        /**
         * Obtiene y modifica los atributos de acuatico
         */
        acuatico.setNombre("Ballena");
        acuatico.setLugarOrigen("Mar");
        acuatico.setColor("Azul");
        acuatico.setNumeroAletas(2); //pasó un tamaño de 2 aletas
        /**
         * Imprime lo que contiene toString de animal
         */
        System.out.println(acuatico); 
        
        //=========BALLENA=========
        /**
         * Crea constructor y aqui mismo pasa los parámetros de ballena
         */
        Ballena ballena = new Ballena(30, 2,"Ballena", "Mar", "Azul" );
        /**
         * Imprime lo que contiene toSString de ballena
         */
        System.out.println(ballena); 
        
        //=========TERRESTRE=========

        System.out.println("\n----- TERRESTRE -----\n"); 
        
        Terrestre terrestre = new Terrestre();
        /**
         * Obtiene y modifica los atributos de acuatico
         */
        terrestre.setNombre("Perro");
        terrestre.setLugarOrigen("Granja");
        terrestre.setColor("Cafe");
        terrestre.setNumeroPatas(4); //pasó un tamaño de 4 patas
        /**
         * Imprime lo que contiene toString de animal
         */
        System.out.println(terrestre); 
        
        //=========PERRO=========
        /**
         * Crea constructor y aqui mismo pasa los parámetros de ballena
         */
        Perro perro = new Perro("Dorado", 4 ,"Perro", "Granja", "Cafe" );
        /**
         * Imprime lo que contiene toSString de ballena
         */
        System.out.println(perro); 
        
        //=========AEREO=========
        System.out.println("\n----- AEREO -----\n"); 
        
        Aereo aereo = new Aereo();
        
        /**
         * Obtiene y modifica los atributos de acuatico
         */
        aereo.setNombre("Perro");
        aereo.setLugarOrigen("Granja");
        aereo.setColor("Cafe");
        aereo.setNumeroAlas(2);
        
        /**
         * Imprime lo que contiene toString de animal
         */
        System.out.println(aereo); 
        
        //=========PAJARO=========
        /**
         * Crea constructor y aqui mismo pasa los parámetros de ballena
         */
        Pajaro pajaro = new Pajaro("Grande", 4 ,"Perro", "Granja", "Cafe" );
        
        /**
         * Imprime lo que contiene toString de animal
         */
        System.out.println(pajaro); 

    }
    
}
