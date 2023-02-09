package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumTestBase;
import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Menu extends SeleniumWrapper {
    public Menu(WebDriver driver) {
        super(driver);
    }

    public static void seleccionarRol() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
}