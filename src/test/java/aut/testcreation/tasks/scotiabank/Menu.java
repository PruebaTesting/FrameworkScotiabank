package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumTestBase;
import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Scotiabank.XXX;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Menu extends SeleniumWrapper {
    public Menu(WebDriver driver) {
        super(driver);
    }
    public static void ClavePersonal() throws IOException, InvalidFormatException, AWTException {
        clickear(XXX); //click btn-Menu
        seleccionarOpcionPorTexto(XXX, "Cambio de Clave");
        escribirEnInput(XXX, "Num de usuario");
        escribirEnInput(XXX, "clave actual");
        escribirEnInput(XXX, "clave nueva");
        escribirEnInput(XXX, "confirmar clave nueva");
    }
    public static void cambioImagenvalida(String pMenu, String pDatos) throws IOException, InvalidFormatException, AWTException {
        clickear(XXX); //click btn-Menu
        seleccionarOpcionPorTexto(XXX, pMenu);
        escribirEnInput(XXX, pDatos);
        clickear(XXX); //click btn-Cerrar
    }
    public static void cambioImagenInvalido(String pMenu, String pDatos, String pPathImg) throws IOException, InvalidFormatException, AWTException {
        clickear(XXX); //click btn-Menu
        seleccionarOpcionPorTexto(XXX, pMenu);
        escribirEnInput(XXX, pDatos);
        clickear(XXX); //click btn-Cerrar
        clickear(XXX); //click btn-Aceptar
        obtenerTexto(XXX); //capturar frase
        insertarArchivo(XXX, pPathImg);
    }
    public static void cambioMail(String pMenu, String pMail, String pCiudad, String pTelefono, String pExtension, String pContrasenia) throws IOException, InvalidFormatException, AWTException {
        clickear(XXX); //click btn-Menu
        seleccionarOpcionPorTexto(XXX, pMenu);
        escribirEnInput(XXX, pMail);
        escribirEnInput(XXX, pCiudad);
        escribirEnInput(XXX, pTelefono);
        escribirEnInput(XXX, pExtension);
        escribirEnInput(XXX, pContrasenia);
        clickear(XXX); //click btn-modificar
        clickear(XXX); // click btn-aceptar
    }
    public static void ingresarToken(String pToken) throws IOException, InvalidFormatException, AWTException {
        escribirEnInput(XXX, pToken);
        clickear(XXX); // click btn-Regresar
    }

    public static void CambioPreguntaSecreta(String pPreguntaSecreta, String pRespuesta, String pConfirRta) throws IOException, InvalidFormatException, AWTException {
        escribirEnInput(XXX, pPreguntaSecreta);
        escribirEnInput(XXX, pRespuesta);
        escribirEnInput(XXX, pConfirRta);
        clickear(XXX); // click btn-Regresar
    }

    public static void RegistarToken(String pDatos, String pCaptcha) throws IOException, InvalidFormatException, AWTException {
        escribirEnInput(XXX, pDatos);
        escribirEnInput(XXX, pCaptcha);
        clickear(XXX); // click btn-Regresar

    public static void seleccionarRol() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
}