package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Informacion extends SeleniumWrapper {
    public Informacion(WebDriver driver) {
        super(driver);
    }

    public static void tipoLog() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void generacionXML() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void listadoXML() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void aceptarPopUp() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
}
