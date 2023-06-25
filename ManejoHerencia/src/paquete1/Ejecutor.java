package paquete1;

import java.util.ArrayList;
import java.util.List;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Prestamo> prestamos = new ArrayList<>();

        int opcion;
        do {
            System.out.println("------------------Bienvenido-------------:");
            System.out.println("El siguiente programa registrará las listas de prestamos hasta que eliga salir y presentar las listas.");
            System.out.println("Seleccione el tipo de préstamo:");
            System.out.println("1. Préstamo Automóvil");
            System.out.println("2. Préstamo Educativo");
            System.out.println("0. Salir y presentar la lista de Prestamos");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del préstamo automóvil:");

                    System.out.print("Nombre del beneficiario: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Apellido del beneficiario: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Username del beneficiario: ");
                    String username = scanner.nextLine();

                    System.out.print("Tiempo de préstamo en meses: ");
                    int tiempoPrestamoMeses = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea

                    System.out.print("Ciudad del préstamo: ");
                    String ciudadPrestamo = scanner.nextLine();

                    System.out.print("Tipo de automóvil: ");
                    String tipoAutomovil = scanner.nextLine();

                    System.out.print("Marca de automóvil: ");
                    String marcaAutomovil = scanner.nextLine();

                    System.out.print("Nombre del garante: ");
                    String nombreGarante = scanner.nextLine();

                    System.out.print("Apellido del garante: ");
                    String apellidoGarante = scanner.nextLine();

                    System.out.print("Username del garante: ");
                    String usernameGarante = scanner.nextLine();

                    System.out.print("Valor del automóvil: ");
                    double valorAutomovil = scanner.nextDouble();

                    Persona beneficiario = new Persona(nombre, apellido, username);
                    Persona garante1 = new Persona(nombreGarante, apellidoGarante, usernameGarante);
                    PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(beneficiario, tiempoPrestamoMeses,
                            ciudadPrestamo, tipoAutomovil, marcaAutomovil, garante1, valorAutomovil);
                    prestamos.add(prestamoAutomovil);
                    break;

                case 2:
                    System.out.println("Ingrese los datos del préstamo educativo:");

                    System.out.print("Nombre del beneficiario: ");
                    nombre = scanner.nextLine();

                    System.out.print("Apellido del beneficiario: ");
                    apellido = scanner.nextLine();

                    System.out.print("Username del beneficiario: ");
                    username = scanner.nextLine();

                    System.out.print("Tiempo de préstamo en meses: ");
                    tiempoPrestamoMeses = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea

                    System.out.print("Ciudad del préstamo: ");
                    ciudadPrestamo = scanner.nextLine();

                    System.out.print("Nivel de estudio: ");
                    String nivelEstudio = scanner.nextLine();

                    System.out.print("Nombre del centro educativo: ");
                    String nombreCentro = scanner.nextLine();

                    System.out.print("Siglas del centro educativo: ");
                    String siglasCentro = scanner.nextLine();

                    System.out.print("Valor de la carrera: ");
                    double valorCarrera = scanner.nextDouble();

                    beneficiario = new Persona(nombre, apellido, username);
                    InstitucionEducativa centroEducativo = new InstitucionEducativa(nombreCentro, siglasCentro);
                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo(beneficiario, tiempoPrestamoMeses,
                            ciudadPrestamo, nivelEstudio, centroEducativo, valorCarrera);
                    prestamos.add(prestamoEducativo);
                    break;
            }

        } while (opcion != 0);
        System.out.println("============================");
        System.out.println("Lista de préstamos generados:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo.toString());
            System.out.println("-----------------------");
        }
    }
}
