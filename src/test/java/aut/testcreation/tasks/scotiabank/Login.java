package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Login extends SeleniumWrapper {
    public Login(WebDriver driver) {
        super(driver);
    }

    public static void ingresar() throws IOException, InvalidFormatException, AWTException {
        //navegarURL("");
        //clickear(BtnCuenta);
        reporte.reportarEvento("", true, false);
    }
    public static void registrarse() throws IOException, InvalidFormatException, AWTException {
        //navegarURL();
        //escribirEnInput();
        //escribirEnInput();
        //clickear();
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
}
