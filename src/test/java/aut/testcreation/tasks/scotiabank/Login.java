package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Scotiabank.*;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Login extends SeleniumWrapper {
    public Login(WebDriver driver) {
        super(driver);
    }

    public static void FuncionUsuario(String pIdioma) throws IOException, InvalidFormatException, AWTException {
        //navegarURL("");
        reporte.reportarEvento("", true, false);
        seleccionarOpcionPorTexto(XXX, pIdioma);
        reporte.reportarEvento("", true, false);
    }
}
