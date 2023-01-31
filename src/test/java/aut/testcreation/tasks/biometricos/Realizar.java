package aut.testcreation.tasks.biometricos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class Realizar extends SeleniumWrapper {
    public Realizar(WebDriver driver) {
        super(driver);
    }

    public static void consultaClienteYSeleccionarProducto() {
        System.out.println("Realizar.consultaClienteYSeleccionarProducto");
    }

    public static void busquedaCorrectaClienteNoEnrolado() {
        System.out.println("Realizar.busquedaCorrectaClienteNoEnrolado");
    }

    public static void escaneoYValidacionCorrecto () {
        System.out.println("Realizar.escaneoYValidacionCorrecto");
    }

    public static void digitalizacionDatosINE() {
        System.out.println("Realizar.digitalizacionDatosINE");
    }

    public static void busquedaClienteNoEnrolado() {
        System.out.println("Realizar.busquedaClienteNoEnrolado");
    }
}
