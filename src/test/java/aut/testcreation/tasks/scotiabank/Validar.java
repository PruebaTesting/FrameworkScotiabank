package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

import static aut.testcreation.pages.Page_Scotiabank.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.io.IOException;
import static aut.testcreation.pages.Page_Scotiabank.XXX;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Validar extends SeleniumWrapper {
    public Validar(WebDriver driver) {
        super(driver);
    }

    public static boolean mensajeSistema(String pMensaje) throws IOException, InvalidFormatException, AWTException {
    public static boolean mensajeSistema(String parametro){
        verificarTexto(XXX, parametro);
        return false;
    }

    public static void cambioImagen(){
        estaDesplegado(XXX);
        
    public static void mensajeSistema(String pMensaje) throws IOException, InvalidFormatException, AWTException {
        verificarTexto(XXX, pMensaje);
        reporte.reportarEvento("", true, false);
        return false;
    }
}
