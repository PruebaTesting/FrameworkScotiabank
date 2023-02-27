package aut.testcreation.tasks.scotiabank;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Scotiabank.XXX;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Login extends SeleniumWrapper {
    public Login(WebDriver driver) {super(driver);}

    public static void FuncionUsuario(String pIdioma) throws IOException, InvalidFormatException, AWTException {
        //navegarURL("");
        //seleccionarOpcionPorTexto(XXX ,"pIdioma");
        reporte.reportarEvento("", true, false);
    }
    public static void ingresarPageConsulta() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
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
    }
    public static void ingresarScotiatrade() throws IOException, InvalidFormatException, AWTException {
        navegarURL("XXX");
        //clickear(XXX);
        //escribirEnInput(XXX, "se escribe num. usuario");
        //escribirEnInput(XXX, "se escribe num. usuario");
        //clickear(XXX);
        //clickear(XXX);
        //clickear(XXX);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void ingresar() throws IOException, InvalidFormatException, AWTException {
        //navegarURL("");
        //clickear(BtnCuenta);
        reporte.reportarEvento("", true, false);
    }
    public static void InicioSesion() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
}