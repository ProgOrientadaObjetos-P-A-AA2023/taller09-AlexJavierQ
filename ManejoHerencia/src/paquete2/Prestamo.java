package paquete2;

import paquete1.Persona;

public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamoMeses;
    protected String ciudadPrestamo;

    public Prestamo(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamoMeses = tiempoPrestamoMeses;
        this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
    }

    //Setters
    public void establecerBeneficiaio(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void establecerTipoPrestamoMeses(int tiempoPrestamoMeses) {
        this.tiempoPrestamoMeses = tiempoPrestamoMeses;
    }

    public void establecerCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }

    //Getters
    public Persona obtenerBeneficio() {
        return beneficiario;
    }

    public int obtenerTipoPrestamoMeses() {
        return tiempoPrestamoMeses;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo: " + "\n"
                + "Beneficiario: " + beneficiario + "\n"
                + "TiempoPrestamoMeses: " + tiempoPrestamoMeses + "\n"
                + "Ciudad delPrestamo: " + ciudadPrestamo + "\n";
    }
}
