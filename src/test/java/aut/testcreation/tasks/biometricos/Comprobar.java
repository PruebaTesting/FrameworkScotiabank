package aut.testcreation.tasks.biometricos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class Comprobar extends SeleniumWrapper {
    public Comprobar(WebDriver driver) {
        super(driver);
    }

    public static boolean accesoPaginaAplicativoBiometricos(String pNombre) {
        System.out.println("Comprobar.accesoPaginaAplicativoBiometricos");
        return true;
    }

    public static boolean accesoAplicativoBiometricos(String pOpciones) {
        System.out.println("Comprobar.accesoAplicativoBiometricos");
        return true;
    }

    public static boolean enrolamiento() {
        System.out.println("Comprobar.enrolamiento");
        return true;
    }

    public static boolean finalizacionProceso() {
        System.out.println("Comprobar.finalizacionProceso");
        return true;
    }

    public static boolean validacionExitosa() {
        System.out.println("Comprobar.validacionExitosa");
        return true;
    }

}
