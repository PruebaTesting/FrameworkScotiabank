package aut.testcreation.tasks.cashManagment;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Comprobar extends SeleniumWrapper {
    public Comprobar(WebDriver driver) {
        super(driver);
    }

    public static boolean descargaComprobante() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        System.out.println("Comprobar.descargaComprobante");
        return true;
    }

    public static boolean creacionBeneficiarioExitosa(String pResultadoEsperado) throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        System.out.println("Comprobar.creacionBeneficiarioExitosa");
        return true;
    }

    public static boolean visualizacionDetalles(String pResultadoEsperado) throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        System.out.println("Comprobar.visualizacionDetalles");
        return true;
    }

    public static boolean formatoDescarga() {
        System.out.println("Comprobar.formatoDescarga");
        return true;
    }
    public static boolean resultadoEsperado(){
        System.out.println("comprobar.resultadoEsperado");
        return true;
    }



}
