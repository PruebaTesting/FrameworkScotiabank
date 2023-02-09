package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Consulta extends SeleniumWrapper {
    public Consulta(WebDriver driver) {
        super(driver);
    }

    public static void sinCuenta() throws IOException, InvalidFormatException, AWTException {
        //escribirEnInput(fldCuenta, "");
        reporte.reportarEvento("", true, false);
        //seleccionarOpcionPorTexto(fldFecha, "");
        reporte.reportarEvento("", true, false);
        //clickear(BtnConsultar);
        reporte.reportarEvento("", true, false);
    }
    public static void seleccionarFecha() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
}
