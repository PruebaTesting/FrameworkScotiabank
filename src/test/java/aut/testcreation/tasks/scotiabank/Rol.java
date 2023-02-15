package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Scotiabank.XXX;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Rol extends SeleniumWrapper {
    public Rol(WebDriver driver) {
        super(driver);
    }

    public static void funcionRol(String pRol) throws IOException, InvalidFormatException, AWTException {
        //seleccionarOpcionPorTexto(XXX, pRol);
        reporte.reportarEvento("", true, false);
    }
    public static void rolPremiadoProveedor() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void RolConsulta() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
}
