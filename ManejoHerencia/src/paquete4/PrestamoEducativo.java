package paquete4;

import paquete1.Persona;
import paquete2.Prestamo;
import paquete1.InstitucionEducativa;

public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double vMensualPagoPrestamoValorCarrera;

    public PrestamoEducativo(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo,
            String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, tiempoPrestamoMeses, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        double valorMensual = valorCarrera / tiempoPrestamoMeses;
        double descuento = valorMensual * 0.1;
        this.vMensualPagoPrestamoValorCarrera = valorMensual - descuento;
    }

// Setters
    public void establecerNivelEstudio(String nE) {
        this.nivelEstudio = nE;
    }

    public void estabelecrCentroEducativo(InstitucionEducativa cE) {
        this.centroEducativo = cE;
    }

    public void establecerValorCarrera(double vC) {
        this.valorCarrera = vC;
    }

    public void establecerVMensualPagoPrestamoValorCarrera(double v) {
        this.vMensualPagoPrestamoValorCarrera = v;
    }
// Getters

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerVMensualPagoPrestamoValorCarrera() {
        return vMensualPagoPrestamoValorCarrera;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPrestamoEducativo: " + "\n"
                + "NivelEstudio: " + nivelEstudio + "\n"
                + "Centro Educativo: " + centroEducativo + "\n"
                + "Valor Carrera: " + valorCarrera + "\n"
                + "Valor Mensual del Pago: " + vMensualPagoPrestamoValorCarrera + "\n";
    }
}
