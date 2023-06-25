package paquete3;

import paquete2.Prestamo;
import paquete1.Persona;

public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double vMensualPagoPrestamoAuto;

    public PrestamoAutomovil(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo,
            String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        super(beneficiario, tiempoPrestamoMeses, ciudadPrestamo);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        this.vMensualPagoPrestamoAuto = valorAutomovil / tiempoPrestamoMeses;
    }
// Setters

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }

    public void setvMensualPagoPrestamoAuto(double vMensualPagoPrestamoAuto) {
        this.vMensualPagoPrestamoAuto = vMensualPagoPrestamoAuto;
    }

    //Getters
    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerVMensualPagoPrestamoAuto() {
        return vMensualPagoPrestamoAuto;
    }
// Calcular

    @Override
    public String toString() {
        return super.toString()
                + "\nPrestamoAutomovil: \n"
                + "TipoAutomovil: " + tipoAutomovil + "\n"
                + "Marca del Automovil: " + marcaAutomovil + "\n"
                + "Garante1: " + garante1 + "\n"
                + "Valor del Automovil: " + valorAutomovil + "\n"
                + "Valor Mensual del Pago: " + vMensualPagoPrestamoAuto + "\n";
    }
}
