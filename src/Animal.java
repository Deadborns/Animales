/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public abstract class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    
    public abstract void Sonido();
    
    public void correr(){
       System.out.println("Corriendo");
    }
}
