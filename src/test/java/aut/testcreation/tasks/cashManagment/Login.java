package aut.testcreation.tasks.cashManagment;

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

    public static void correcto(String pUsuario, String pContrasenia, String pToken) throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        //System.out.println("Login.correcto");
    }

    public static void confirmarAutenticacion(String pContrasenia, String pToken) throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        System.out.println("Login.confirmarAutenticacion");
    }

}
