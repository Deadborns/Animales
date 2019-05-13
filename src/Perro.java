/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Perro extends Animal{

    public Perro(String nombre, String especie) {
        super(nombre, especie);
    }

    @Override
    public void Sonido() {
        System.out.println("Guau");
    }
    
}
