/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.gabrielweb;

/**
 *
 * @author gabriel
 */
public class Cliente {
    
    private String nombre;
    private String email;
    private int edad;

    public Cliente() {
        this.nombre="Gabriel";
        this.email="gabriel21kun@gmail.com";
        this.edad=19;
    }

    public Cliente(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", email=" + email + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
