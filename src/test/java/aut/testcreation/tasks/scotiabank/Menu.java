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
        //clickear(XXX); //click btn-Menu
        //seleccionarOpcionPorTexto(XXX, "Cambio de Clave");
        //escribirEnInput(XXX, "Num de usuario");
        //escribirEnInput(XXX, "clave actual");
        //escribirEnInput(XXX, "clave nueva");
        //escribirEnInput(XXX, "confirmar clave nueva");
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void IntentarCambiarClave() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
    public static void ClavePersonalIncorrecta() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void cambioImagenvalida() throws IOException, InvalidFormatException, AWTException {
        //clickear(XXX); //click btn-Menu
        //seleccionarOpcionPorTexto(XXX, pMenu);
        //escribirEnInput(XXX, pDatos);
        //clickear(XXX); //click btn-Cerrar
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void cambioImagenInvalido() throws IOException, InvalidFormatException, AWTException {
        //clickear(XXX); //click btn-Menu
        //seleccionarOpcionPorTexto(XXX, pMenu);
        //escribirEnInput(XXX, pDatos);
        //clickear(XXX); //click btn-Cerrar
        //clickear(XXX); //click btn-Aceptar
        //obtenerTexto(XXX); //capturar frase
        //insertarArchivo(XXX, pPathImg);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void cambioMail() throws IOException, InvalidFormatException, AWTException {
        //clickear(XXX); //click btn-Menu
        //seleccionarOpcionPorTexto(XXX, pMenu);
        //escribirEnInput(XXX, pMail);
        //escribirEnInput(XXX, pCiudad);
        //escribirEnInput(XXX, pTelefono);
        //escribirEnInput(XXX, pExtension);
        //escribirEnInput(XXX, pContrasenia);
        //clickear(XXX); //click btn-modificar
        //clickear(XXX); // click btn-aceptar
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void CambioMailConToken() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }

    public static void CambioPreguntaSecreta() throws IOException, InvalidFormatException, AWTException {
        //escribirEnInput(XXX, pPreguntaSecreta);
        //escribirEnInput(XXX, pRespuesta);
        //escribirEnInput(XXX, pConfirRta);
        //clickear(XXX); // click btn-Regresar
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }

    public static void RegistarToken() throws IOException, InvalidFormatException, AWTException {
        //escribirEnInput(XXX, pDatos);
        //escribirEnInput(XXX, pCaptcha);
        //clickear(XXX); // click btn-Regresar
    }
    public static void seleccionarRol() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
    public static void seleccionarFechas() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
    public static void seleccionarFechaFinal() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
    public static void listadoBalanzasEmpresariales() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
    }
    public static void cartasConfirmacion() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void constanciasFiscales() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
    public static void navegacionSuperior() throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
    }
}