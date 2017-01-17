/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguros;

/**
 *
 * @author a024441493z
 */
public class Persona {
    
    private String dir, nombre, dni;
    private int edad;

    public Persona(String dir, String nombre, String dni, int edad) {
        this.dir = dir;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
}
