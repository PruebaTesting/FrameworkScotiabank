package aut.testcreation.tasks.ConstanciasFiscalesSitioCliente;

import framework.engine.selenium.SeleniumWrapper;
import framework.engine.utils.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Scotiabank.XXX;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Datos extends SeleniumWrapper {
    public Datos(WebDriver driver) {
        super(driver);
    }

    public static void IngresarDatos(String pNumeroDeContrato, String pContrasenia) throws IOException, InvalidFormatException, AWTException {
        //escribirEnInput(XXX, ExcelReader.extractDataToExcel(pNumeroDeContrato));
        //escribirEnInput(XXX, ExcelReader.extractDataToExcel(pContrasenia));
        //clickear(XXX); //cbx no soy un robot
        //reporte.reportarEvento("", true, false);
        //clickear(XXX); //btn ok
        //seleccionarOpcionPorTexto(XXX, "seleccionar año fiscal");
        //clickear(XXX); //btn consultar
        //clickear(XXX); //btn download
        reporte.reportarEvento("", true, false);
    }
    public static void CompletarDatos() throws IOException, InvalidFormatException, AWTException {
        //clickear(XXX); //cbx no soy un robot
        //reporte.reportarEvento("", true, false);
        //clickear(XXX); //btn ok
        //seleccionarOpcionPorTexto(XXX, "seleccionar año fiscal");
        //clickear(XXX); //btn consultar
        //clickear(XXX); //btn download
        reporte.reportarEvento("", true, false);
    }
}
