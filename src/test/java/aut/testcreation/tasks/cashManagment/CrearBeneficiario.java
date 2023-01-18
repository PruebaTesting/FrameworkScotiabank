package aut.testcreation.tasks.cashManagment;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.ReportFunctionalities.reporte;

public class CrearBeneficiario extends SeleniumWrapper {
    public CrearBeneficiario(WebDriver driver) {
        super(driver);
    }

    public static void pagoDeServiciosYFacturas(String pAlias, String pNumCliente) throws IOException, InvalidFormatException, AWTException {
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        reporte.reportarEvento("", true, false);
        System.out.println("CrearBeneficiario.pagoDeServiciosYFacturas");
    }

    public static void personaMoral(String pNombrePerfil, String pTipoCuenta, String pNumCuenta, String pNumIdentificacion, String pLimiteAbono) {
        System.out.println("CrearBeneficiario.personaMoral");
    }

    public static void personaFisica(String pNombrePerfil, String pTipoCuenta, String pNumCuenta, String pNumIdentificacion, String pNombre, String pAoellidoPaterno, String pApellidoMaterno, String pLimiteAbono) {
        System.out.println("CrearBeneficiario.personaFisica");
    }

    public static void contribucionesGubernamentales(String pTipoImpuesto) {
        System.out.println("CrearBeneficiario.contribucionesGubernamentales");
    }

    public static void contribucionesFederales() {
        System.out.println("CrearBeneficiario.contribucionesFederales");
    }

}
