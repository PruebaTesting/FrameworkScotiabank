package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Scotiabank.XXX;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Datos extends SeleniumWrapper {
    public Datos(WebDriver driver) {
        super(driver);
    }

    public static void IngresarDatos(String pDato, String pDato2) throws IOException, InvalidFormatException, AWTException {
        escribirEnInput(XXX, pDato);
        escribirEnInput(XXX, pDato);
        clickear(XXX); //cbx no soy un robot
        reporte.reportarEvento("", true, false);
        clickear(XXX); //btn ok
        seleccionarOpcionPorTexto(XXX, "seleccionar año fiscal");
        clickear(XXX); //btn consultar
        reporte.reportarEvento("", true, false);
        clickear(XXX); //btn download
        reporte.reportarEvento("", true, false);
    }
}
