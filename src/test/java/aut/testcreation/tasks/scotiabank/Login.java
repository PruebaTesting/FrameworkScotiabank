package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.io.IOException;
import static aut.testcreation.pages.Page_Scotiabank.XXX;
import java.awt.*;
import java.io.IOException;
import static aut.testcreation.pages.Page_Scotiabank.*;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Login extends SeleniumWrapper {
    public Login(WebDriver driver) {
        super(driver);
    }

    public static void ingresarScotiatrade() throws IOException, InvalidFormatException, AWTException {
        navegarURL("XXX"); //homePage scotiatrade
        clickear(XXX); //click boton-Entrar
        escribirEnInput(XXX, "se escribe num. usuario");
        escribirEnInput(XXX, "se escribe la contraseña");
        clickear(XXX); //click btn-Continuar
        clickear(XXX); //click a btn-Aceptar a ventana emergente
        clickear(XXX); //click btn-cerrar
    }

    public static void cambioContrasenia() throws IOException, InvalidFormatException, AWTException {
        navegarURL("XXX"); //homePage scotiatrade
        clickear(XXX); //click boton-Entrar
        clickear(XXX); // click en botón-CambioContraseña
        clickear(XXX); // click boton-aceptar (sin capturar num. de usuario)

    public static void FuncionUsuario(String pIdioma) throws IOException, InvalidFormatException, AWTException {
        //navegarURL("");
        reporte.reportarEvento("", true, false);
        seleccionarOpcionPorTexto(XXX, pIdioma);
        reporte.reportarEvento("", true, false);
    }
}
