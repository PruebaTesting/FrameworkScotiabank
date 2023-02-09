package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Validar extends SeleniumWrapper {
    public Validar(WebDriver driver) {
        super(driver);
    }

    public static void listaRegistros() throws IOException, InvalidFormatException, AWTException {
        //encontarElementos(lstRegistros);
        reporte.reportarEvento("", true, false);
    }
}
