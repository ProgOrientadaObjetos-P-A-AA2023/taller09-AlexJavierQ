/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

public class InstitucionEducativa {

    protected String nombre;
    protected String siglas;

  public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerSiglas(String s) {
        this.siglas = s;
    }
    
    @Override
    public String toString() {
        return "\nInstitución Educativa\n"
                + "Nombre: " + nombre + "\n"
                + "Siglas: " + siglas + "\n"
                ;
    }
}
