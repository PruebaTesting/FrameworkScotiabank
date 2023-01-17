package aut.testcreation.tasks.cashManagment;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class Comprobar extends SeleniumWrapper {
    public Comprobar(WebDriver driver) {
        super(driver);
    }

    public static boolean descargaComprobante() {
        System.out.println("Comprobar.descargaComprobante");
        return true;
    }

    public static boolean creacionBeneficiarioExitosa(String pResultadoEsperado) {
        System.out.println("Comprobar.creacionBeneficiarioExitosa");
        return true;
    }

}
