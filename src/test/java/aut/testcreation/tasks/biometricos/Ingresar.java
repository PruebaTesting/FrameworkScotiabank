package aut.testcreation.tasks.biometricos;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class Ingresar extends SeleniumWrapper {
    public Ingresar(WebDriver driver) {
        super(driver);
    }

    public static void aAplicativosBiometricos(String pDatos) {
        System.out.println("Ingresar.aAplicativosBiometricos");
    }

    public static void conHuella() {
        System.out.println("Ingresar.conHuella");
    }

}
